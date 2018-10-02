package vehicle;


public class SportsCar extends Car{
    private boolean tractionControlOn;
    private boolean sportModeOn;
    private boolean absOn;

    public SportsCar(String name, int topSpeed, boolean isManual, int seats, int wheels, int gears,  boolean tractionControlOn, boolean sportModeOn, boolean absOn) {
        super(name, topSpeed, isManual, seats, 4, gears);
        this.tractionControlOn = tractionControlOn;
        this.sportModeOn = sportModeOn;
        this.absOn = absOn;
    }

    public boolean isTractionControlOn() {
        return tractionControlOn;
    }

    public boolean isSportModeOn() {
        return sportModeOn;
    }

    public boolean isABSOn() {
        return absOn;
    }

    public void setTractionControlOn(boolean tractionControlOn) {
        this.tractionControlOn = tractionControlOn;
    }

    public void setSportModeOn(boolean sportModeOn) {
        this.sportModeOn = sportModeOn;
    }

    public void setAbsOn(boolean absOn) {
        this.absOn = absOn;
    }
}
