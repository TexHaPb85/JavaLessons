package JavaLessons.Lesson3OOP.ComputerAssemblerExample.interfaces;

public abstract class HardDrive {
    private double memorySize;
    private double memorySpeed;

    public abstract void saveData();
    public abstract void returnSavedData ();
}
