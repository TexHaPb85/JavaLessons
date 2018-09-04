package JavaLessons.Lesson3OOP.ComputerAssemblerExample.Gigabyte;

import JavaLessons.Lesson3OOP.ComputerAssemblerExample.interfaces.MotherBoard;

public class GigabyteMotherBoard extends MotherBoard {
    @Override
    public void dataTransfer() {
        System.out.println("Data are transfering  by Gigabyte Motherboard");
    }

    @Override
    public void powerReciving() {
        System.out.println("Power are reciving by Gigabyte Motherboard");
    }
}
