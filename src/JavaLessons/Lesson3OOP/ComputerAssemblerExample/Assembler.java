package JavaLessons.Lesson3OOP.ComputerAssemblerExample;

import JavaLessons.Lesson3OOP.ComputerAssemblerExample.AMD.AMDCPU;
import JavaLessons.Lesson3OOP.ComputerAssemblerExample.Gigabyte.GigabyteHardDrive;
import JavaLessons.Lesson3OOP.ComputerAssemblerExample.Gigabyte.GigabyteMotherBoard;
import JavaLessons.Lesson3OOP.ComputerAssemblerExample.Gigabyte.GigabytePowerSupply;
import JavaLessons.Lesson3OOP.ComputerAssemblerExample.NVidida.GeForceVideoCard;
import JavaLessons.Lesson3OOP.ComputerAssemblerExample.NVidida.NvidiaRam;



public class Assembler {
    public static void main(String[] args) {
        Computer computer = new Computer(new AMDCPU(), new GigabyteHardDrive(), new GigabyteMotherBoard(),
                new GigabytePowerSupply(),new NvidiaRam(),new GeForceVideoCard());
        computer.testWork();
    }
}
