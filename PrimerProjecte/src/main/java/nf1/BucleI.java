package nf1;

import java.util.Scanner;

public class BucleI {

    public static void main(String[] args) {
        //Programa que demana un enter a l'usuari i mostra la seqüència
        //d'1 fins al número introduït

        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        byte numero, comptador=1;

        //Demanem entrada a l'usuari
        System.out.println("Introduix un número enter qualsevol:");
        numero = ent.nextByte();

        //Mostrar la sortida
        /*
        while(condició){    //mentre la condició és certa entrem al bucle, si és falsa anem a les intruccions
                            // que hi ha a continuació del bucle
            //instruccions bucle


        }   //Final del bucle --> tornem a l'inici del bucle, on està la paraula while
        */


        while( comptador<= numero ){
            System.out.println(comptador);
            comptador = (byte) (comptador + 1);
        }
        //Instruccions de després del bucle
        System.out.println("Hem sortit del bucle!!");


        //if( numero>=comptador ) System.out.println(comptador);
        //comptador = (byte) (comptador + 1);

    }
}
