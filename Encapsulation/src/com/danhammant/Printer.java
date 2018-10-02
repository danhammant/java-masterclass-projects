package com.danhammant;


public class Printer {
    private int tonerLevel = 100;
    private int pagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, boolean isDuplexPrinter) {
        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }

        this.pagesPrinted = 0;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }

    public void printPage() {
        printPage(1);
    }

    public void printPage(int numberOfPages) {
        int pagesToPrint = numberOfPages;

        if (tonerLevel == 0) {
            System.out.println("Toner empty. Please refill.");
            return;
        }

        if (isDuplexPrinter) {
            System.out.println("Printer is a duplex.");
            pagesToPrint /= 2;
        }

        pagesPrinted += pagesToPrint;
        tonerLevel -= numberOfPages;

    }

    public void refillToner(int amount) {
        if (tonerLevel + amount > 100) {
            tonerLevel = 100;
        } else {
            tonerLevel += amount;
        }

        System.out.println("Toner level now at " + tonerLevel + "%");
    }
}
