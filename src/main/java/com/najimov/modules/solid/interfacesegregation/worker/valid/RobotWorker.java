package com.najimov.modules.solid.interfacesegregation.worker.valid;

public class RobotWorker implements Workable {
    @Override
    public void work() {
        System.out.println("Robot worker is working");
    }
}
/// Why it's better:    Each interface has a single responsibility also follows SRP
///                     Classes only implement what they actually need
///                     Eliminates unnecessary methods and runtime exceptions
