package JavaLessons.Lesson3OOP.ComputerAssemblerExample.interfaces;

public abstract class MotherBoard {
    private short psiPortsQuantity;
    private short psiExspressQuantity;
    private short usbQuantity;
    private short RAMPortsQuantity;

    public abstract void dataTransfer();

    public abstract void powerReciving();
}
