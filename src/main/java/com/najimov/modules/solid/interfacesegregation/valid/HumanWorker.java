package com.najimov.modules.solid.interfacesegregation.valid;

import com.najimov.modules.solid.interfacesegregation.Worker;

public class HumanWorker implements Workable, Eatable {
    @Override
    public void eat() {
        System.out.println("Human worker is eating");
    }

    @Override
    public void work() {
        System.out.println("Human worker is working");
    }
}
