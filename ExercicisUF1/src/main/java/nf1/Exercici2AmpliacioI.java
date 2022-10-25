package nf1;/*
Fer un programa en Java que mostre els números enters entre el -50 i l'introduït per l'usuari, ambdós inclosos.
Per cada número ha de dir si és parell o imparell.
Exemple:

    Introduix un enter (-50..127):
    -47

	-50 és parell
	-49 és imparell
	-48 és parell
	-47 és imparell
 */

import java.util.Scanner;

public class Exercici2AmpliacioI {

    public static void main(String[] args) {

        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        byte comptador = -50;   // variable de control
        byte numeroFinal;       // variable de control

        //Demanem l'entrada a l'usuari --> límit superior de la seqüència a mostrar
        System.out.println("Introduix un enter (-50..127):");
        numeroFinal = ent.nextByte();   // actualització de variable de control

        //Mostrar la sortida
        while( comptador <= numeroFinal && comptador >= -50 ){ // condició, apareixen les vars de control
            System.out.print(comptador+ " és ");
            if(comptador % 2 == 0) System.out.println(" parell");
            else System.out.println(" imparell");
            comptador = (byte) (comptador + 1);     // actualització de variable de control
        }
  
    }






}
