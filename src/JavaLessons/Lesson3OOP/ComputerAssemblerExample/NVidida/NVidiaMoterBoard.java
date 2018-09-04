package JavaLessons.Lesson3OOP.ComputerAssemblerExample.NVidida;

import JavaLessons.Lesson3OOP.ComputerAssemblerExample.interfaces.MotherBoard;

public class NVidiaMoterBoard extends MotherBoard {
    @Override
    public void dataTransfer() {
        System.out.println("Data are transfering  by Nvidia Motherboard");
    }

    @Override
    public void powerReciving() {
        System.out.println("Power are reciving by Nvidia Motherboard");
    }

}
