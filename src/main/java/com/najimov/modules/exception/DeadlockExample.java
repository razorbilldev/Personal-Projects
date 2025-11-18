package com.najimov.modules.exception;

import java.util.Objects;

import static java.lang.Thread.sleep;

public class DeadlockExample {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public static void main(String[] args){
        DeadlockExample example = new DeadlockExample();
        example.runTest();
    }

    public void runTest() {
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: locked lock1");
                sleep(100); // pause to let thread2 start
                synchronized (lock2) {
                    System.out.println("Thread 1: locked lock2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2: locked lock2");
                sleep(100);
                synchronized (lock1) {
                    System.out.println("Thread 2: locked lock1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
