package JavaLessons.Lesson3OOP.ComputerAssemblerExample;

import JavaLessons.Lesson3OOP.ComputerAssemblerExample.interfaces.*;

/**
 * @author Misha Yevtushenko
 */
public class Computer {
    private CentralProcessorUnit cPU;
    private HardDrive hardDrive;
    private MotherBoard motherBoard;
    private PowerSupply powerSupply;
    private RAM ram;
    private VideoCard videoCard;

    public Computer(CentralProcessorUnit cPU, HardDrive hardDrive, MotherBoard motherBoard, PowerSupply powerSupply, RAM ram, VideoCard videoCard) {
        this.cPU = cPU;
        this.hardDrive = hardDrive;
        this.motherBoard = motherBoard;
        this.powerSupply = powerSupply;
        this.ram = ram;
        this.videoCard = videoCard;
    }

    public void testWork (){
        cPU.executeDataOperetion();
        cPU.processData();
        hardDrive.saveData();
        motherBoard.dataTransfer();
        powerSupply.sypplyPower();
        ram.shorTermDataSaving();
        videoCard.processMediaData();
    }
}
