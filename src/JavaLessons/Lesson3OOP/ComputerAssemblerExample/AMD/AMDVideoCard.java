package JavaLessons.Lesson3OOP.ComputerAssemblerExample.AMD;

import JavaLessons.Lesson3OOP.ComputerAssemblerExample.interfaces.VideoCard;

public class AMDVideoCard extends VideoCard {
    @Override
    public void processMediaData() {
        System.out.println("Media Date are processing by AMD Video Card.....");
    }
}
