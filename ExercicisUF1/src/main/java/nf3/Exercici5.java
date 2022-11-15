package nf3;

import java.util.Scanner;

public class Exercici5 {

    public static void main(String[] args) {
        //Declaració de constants
        final int QUANTITAT=3;

        //Declaració de variables
        //var variable=78;
        Scanner ent = new Scanner(System.in);
        int[] vector = new int[QUANTITAT];
        int suma=0;
        double mitjana;

        //Introducció de dades
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Introduix un número enter:");
            vector[i] = ent.nextInt();
            suma += vector[i];
        }

        mitjana=(double)suma/QUANTITAT;
        System.out.format("La mitjana és %.2f%n",mitjana);

        System.out.println("Valors més grans o iguals que la mitjana:");
        for (int i = 0; i < vector.length; i++) {
            if( vector[i] >= mitjana) System.out.println(vector[i]);

        }


    }

}
