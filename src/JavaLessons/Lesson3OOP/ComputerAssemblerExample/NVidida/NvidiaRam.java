package JavaLessons.Lesson3OOP.ComputerAssemblerExample.NVidida;

import JavaLessons.Lesson3OOP.ComputerAssemblerExample.interfaces.RAM;

public class NvidiaRam implements RAM {
    @Override
    public void shorTermDataSaving() {
        System.out.println("Short-term data saving by NVidia RAM");
    }
}
