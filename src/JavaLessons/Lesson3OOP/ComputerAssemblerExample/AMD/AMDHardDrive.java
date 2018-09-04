package JavaLessons.Lesson3OOP.ComputerAssemblerExample.AMD;

import JavaLessons.Lesson3OOP.ComputerAssemblerExample.interfaces.HardDrive;

public class AMDHardDrive extends HardDrive{

    @Override
    public void saveData() {
        System.out.println("Data saving by AMD...");
    }

    @Override
    public void returnSavedData() {
        System.out.println("Returning by AMD");
    }
}
