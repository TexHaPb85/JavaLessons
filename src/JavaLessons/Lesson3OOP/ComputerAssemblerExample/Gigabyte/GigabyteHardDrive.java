package JavaLessons.Lesson3OOP.ComputerAssemblerExample.Gigabyte;

import JavaLessons.Lesson3OOP.ComputerAssemblerExample.interfaces.HardDrive;

public class GigabyteHardDrive extends HardDrive {
    @Override
    public void saveData() {
        System.out.println("Data saving by Gigabyte...");
    }

    @Override
    public void returnSavedData() {
        System.out.println("Returning by Gigabyte");
    }
}
