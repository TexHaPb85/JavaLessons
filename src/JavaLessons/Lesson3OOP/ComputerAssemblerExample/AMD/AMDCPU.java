package JavaLessons.Lesson3OOP.ComputerAssemblerExample.AMD;

import JavaLessons.Lesson3OOP.ComputerAssemblerExample.interfaces.CentralProcessorUnit;

public class AMDCPU extends CentralProcessorUnit {
    @Override
    public void processData() {
        System.out.println("Data are processing by AMD CPU......");
    }

    @Override
    public void executeDataOperetion() {
        System.out.println("Operation executing by AMD CPU......");
    }
}
