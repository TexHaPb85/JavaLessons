package JavaLessons.Lesson3OOP.ComputerAssemblerExample.interfaces;

public abstract class CentralProcessorUnit {
    private short clockMemory;
    private double frequency;
    private short cores;
    private short treats;

    public abstract void processData ();

    public abstract void  executeDataOperetion();
}
