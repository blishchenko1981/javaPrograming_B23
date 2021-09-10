package day53_Abstractions.carTask;

public interface AutoPilot extends AutoPark{

    boolean hasSensor = true;
    public abstract void selfDrive();
}
