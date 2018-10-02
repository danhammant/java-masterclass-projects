package com.danhammant;


public class Main {

    public static void main (String[] args) {
        Printer printer = new Printer(97, 0, true);


        printer.printPage();
        printer.printPage(27);

        System.out.println("Toner level is " + printer.getTonerLevel());
    }
}
