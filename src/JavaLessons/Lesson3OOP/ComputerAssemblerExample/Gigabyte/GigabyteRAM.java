package JavaLessons.Lesson3OOP.ComputerAssemblerExample.Gigabyte;

import JavaLessons.Lesson3OOP.ComputerAssemblerExample.interfaces.RAM;

public class GigabyteRAM implements RAM {
    @Override
    public void shorTermDataSaving() {
        System.out.println("Short-term data saving by Gigabyte RAM");
    }
}
