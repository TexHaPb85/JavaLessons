package JavaLessons.Lesson3OOP.ComputerAssemblerExample.Intel;

import JavaLessons.Lesson3OOP.ComputerAssemblerExample.interfaces.VideoCard;

public class IntelVideoCard extends VideoCard {
    @Override
    public void processMediaData() {
        System.out.println("Media Date are processing by Intel Video Card.....");
    }
}
