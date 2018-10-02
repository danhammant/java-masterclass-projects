package com.danhammant;

import static com.danhammant.ThreadColour.ANSI_GREEN;
import static com.danhammant.ThreadColour.ANSI_PURPLE;
import static com.danhammant.ThreadColour.ANSI_RED;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("=== Another Thread ===");
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class' implementation of run()");
                try {
                    anotherThread.join();
                    System.out.println(ANSI_RED + "AnotherThread terminated, so I'm running again");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "I couldn't wait after all.  I was interrupted.");
                }
            }
        });

        myRunnableThread.start();

        System.out.println(ANSI_PURPLE + "Hello again from main thread");

    }
}