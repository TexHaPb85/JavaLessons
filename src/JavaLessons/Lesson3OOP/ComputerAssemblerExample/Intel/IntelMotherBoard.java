package JavaLessons.Lesson3OOP.ComputerAssemblerExample.Intel;

import JavaLessons.Lesson3OOP.ComputerAssemblerExample.interfaces.MotherBoard;

public class IntelMotherBoard extends MotherBoard {
    @Override
    public void dataTransfer() {
        System.out.println("Data are transfering  by Intel Motherboard");
    }

    @Override
    public void powerReciving() {
        System.out.println("Power are reciving by Intel Motherboard");
    }
}
