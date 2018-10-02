package com.danhammant;


public class Microwave {
    private Dimensions dimensions;
    private String brand;
    private boolean isOn;

    public Microwave(Dimensions dimensions, String brand) {
        this.dimensions = dimensions;
        this.brand = brand;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Microwave is on...");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Microwave is off...");
    }

    public boolean isOn() {
        return isOn;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getBrand() {
        return brand;
    }
}
