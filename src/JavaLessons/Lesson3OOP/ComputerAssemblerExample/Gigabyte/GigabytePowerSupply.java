package JavaLessons.Lesson3OOP.ComputerAssemblerExample.Gigabyte;

import JavaLessons.Lesson3OOP.ComputerAssemblerExample.interfaces.PowerSupply;

public class GigabytePowerSupply extends PowerSupply{
    @Override
    public void sypplyPower() {
        System.out.println("Supplying power by Gigabyte");
    }
}
