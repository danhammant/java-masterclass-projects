package com.danhammant;


public class Kitchen {
    private Cooker cooker;
    private Table table;
    private Microwave microwave;
    private Refrigerator refrigerator;
    private Dimensions dimensions;

    public Kitchen(Cooker cooker, Table table, Microwave microwave, Refrigerator refrigerator, Dimensions dimensions) {
        this.cooker = cooker;
        this.table = table;
        this.microwave = microwave;
        this.refrigerator = refrigerator;
        this.dimensions = dimensions;
    }


}
