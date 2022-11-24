package org.example;

import java.util.Random;

public class Exercici16 {
    public static void main(String[] args) {

       int[][] matriu=new int[5][10];
       int[] sumaFiles=new int[5];
       int[] sumaColumnes=new int[10];
       Random r=new Random();

        for (int i = 0; i < matriu.length; i++) {
            //Sumem una fila
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = r.nextInt(11);    //r.nextInt(100-0+1)+0
                System.out.format("%4d", matriu[i][j]);
                sumaFiles[i] += matriu[i][j];
                sumaColumnes[j] += matriu[i][j];
            }
            System.out.println();
        }

        System.out.println("Vector en la suma de les files:");
        for (int i = 0; i < sumaFiles.length; i++) {
            System.out.format("%5d", sumaFiles[i]);
        }
        System.out.println();

        System.out.println("Vector en la suma de les columnes:");
        for (int i = 0; i < sumaColumnes.length; i++) {
            System.out.format("%5d", sumaColumnes[i]);
        }
        System.out.println();


    }
}