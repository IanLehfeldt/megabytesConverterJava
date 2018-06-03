package com.ianl;


public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(-1);
        printMegaBytesAndKiloBytes(0);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes = 0;
        int remainderKiloBytes = 0;
        if ( kiloBytes < 0 ) {
            System.out.println("Invalid value.");
        }
        System.out.println( kiloBytes + " KB = " + megaBytes + " MB and  " + remainderKiloBytes + " KB." );
    }
}