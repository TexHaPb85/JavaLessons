package JavaLessons.Lesson3OOP.ComputerAssemblerExample.Intel;

import JavaLessons.Lesson3OOP.ComputerAssemblerExample.interfaces.CentralProcessorUnit;

public class IntelCPU extends CentralProcessorUnit {
    @Override
    public void processData() {
        System.out.println("Data are processing by intel CPU...");
    }

    @Override
    public void executeDataOperetion() {
        System.out.println("Operation executing by intel CPU...");
    }
}
