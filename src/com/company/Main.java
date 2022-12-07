package com.company;

import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        double[][] array = new double[4][4];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = Math.random();
            }
        }
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                double xx = array[i][j];
                array[i][j] = Double.valueOf(String.format("%.0f",xx));
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("| " + array[i][j] + " |");
            }
            System.out.println();
        }

    }
}
