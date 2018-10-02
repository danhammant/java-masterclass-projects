package com.danhammant;


import java.util.ArrayList;
import java.util.List;

public class Cooker {
    private String brand;
    private String model;
    private boolean ovenOn;
    private List<Hob> hobs;
    private Dimensions dimensions;

    public Cooker(String brand, String model, int hobs, Dimensions dimensions) {
        this.brand = brand;
        this.model = model;
        this.dimensions = dimensions;
        this.ovenOn = false;
        createHobs(hobs);
    }

    public void turnOvenOn() {
        ovenOn = true;
        System.out.println("Oven is on...");
    }

    public void turnOvenOff() {
        ovenOn = false;
        System.out.println("Oven is off...");
    }

    public boolean isOvenOn() {
        return ovenOn;
    }

    public void turnOnHob(int hobNumber) {
        hobs.get(hobNumber - 1).turnOn();
        System.out.println("Hob " + hobNumber + " is on...");
    }

    public void turnOffHob(int hobNumber) {
        hobs.get(hobNumber - 1).turnOff();
        System.out.println("Hob " + hobNumber + " is off...");
    }

    public boolean isHobOn(int hobNumber) {
       return hobs.get(hobNumber - 1).isOn();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    private void createHobs(int numberOfHobs) {
        this.hobs = new ArrayList<>();

        for (int i = 0; i < numberOfHobs; i++) {
            hobs.add(new Hob());
        }
    }

}
