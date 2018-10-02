package com.danhammant;


public class Hob {
    private boolean isOn;

    public Hob() {
        this.isOn = false;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }
}
