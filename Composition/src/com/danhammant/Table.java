package com.danhammant;

public class Table {
    private Dimensions dimensions;
    private int noOfChairs;

    public Table(Dimensions dimensions, int noOfChairs) {
        this.dimensions = dimensions;
        this.noOfChairs = noOfChairs;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getNoOfChairs() {
        return noOfChairs;
    }
}
