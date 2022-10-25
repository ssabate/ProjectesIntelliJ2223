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

public class Exercici2Bis {

    public static void main(String[] args) {

        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        byte comptador;         // variable de control
        byte numeroInicial;     // variable de control
        byte numeroFinal;       // variable de control
        byte temporal;          //la utilitzarem per intercanviar els valors de numeroInicial i numeroFinal

        //Demanem l'entrada a l'usuari --> límit inferior de la seqüència a mostrar
        System.out.println("Introduix un enter (-128..127):");
        numeroInicial = ent.nextByte();   // actualització de variable de control

        // numeroInicial = comptador = ent.nextByte();   // equivalent a les 2 de dalt

        /*int a,b,c,d,e;
        a=0;
        b=0;
        c=0;
        d=0;
        e=0;
        a = b = c = d = e = 0;*/

        //Demanem l'entrada a l'usuari --> límit superior de la seqüència a mostrar
        System.out.println("Introduix un enter (-128..127):");
        numeroFinal = ent.nextByte();   // actualització de variable de control

        //Comprovo si numeroInicial és menor o igual que numeroFinal i sinó intercanvio els seus valors
        if( numeroInicial > numeroFinal){
            //Primer: guardem el valor d'una de les variables a intercanviar a la variable temporal
            temporal = numeroInicial;
            //Segon: copiem el valor de la que variable que no té còpia (numeroFinal), a la que té còpia (numeroInicial)
            numeroInicial = numeroFinal;
            //Tercer: copiem el valor de la variable temporal a la variable que no té còpia (numeroFinal)
            numeroFinal = temporal;
        }

        //Ara que ja tenim el numeroInicial i numeroFinal en ordre creixent assignem numeroInicial a comptador
        comptador = numeroInicial;

        //Mostrar la sortida
        while( comptador <= numeroFinal && comptador >= numeroInicial
            && comptador!= 127){ // condició, apareixen les vars de control
            System.out.print(comptador+ " és ");
            if(comptador % 2 == 0) System.out.println(" parell");
            else System.out.println(" imparell");
            comptador = (byte) (comptador + 1);     // actualització de variable de control
        }

        // Mirem si hem de mostrar el 127
        if(numeroFinal == 127) System.out.println("127 és imparell");
    }






}
