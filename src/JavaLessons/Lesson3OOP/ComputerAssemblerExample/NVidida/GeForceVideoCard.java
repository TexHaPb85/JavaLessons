package JavaLessons.Lesson3OOP.ComputerAssemblerExample.NVidida;

import JavaLessons.Lesson3OOP.ComputerAssemblerExample.interfaces.VideoCard;

public class GeForceVideoCard extends VideoCard {
    @Override
    public void processMediaData() {
        System.out.println("Media Date are processing by GeForce Video Card");
    }
}
