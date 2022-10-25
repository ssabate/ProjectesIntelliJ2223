package nf1;/*
Fer un programa en Java que mostre els números enters entre el -50 i el 50, ambdós inclosos.
Per cada número ha de dir si és parell o imparell.
Exemple:

	-50 és parell
	-49 és imparell
	-48 és parell
	-47 és imparell
	...
	47 és imparell
	48 és parell
	49 és imparell
	50 és parell

 */

import java.util.Scanner;

public class Exercici2 {

    public static void main(String[] args) {

        //Declaració de variables
        byte comptador = -50; //--> variable de control del bucle

        //Mostrar la sortida
        while( comptador <= 50 ){   // condició, on apareix la variable de control
            System.out.print(comptador+ " és ");
            if(comptador % 2 == 0) System.out.println(" parell");
            else System.out.println(" imparell");
            comptador = (byte) (comptador + 1); //actualització de la variable de control
        }

    }






}
