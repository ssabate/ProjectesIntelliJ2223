package nf3;

import java.util.Random;
import java.util.Scanner;

public class Exercici9 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Random r=new Random();
        int[] comptadors=new int['Z'-'A'+1];
        int n, index=0, candidat=2;

        do {
            System.out.println("Introduix un número enter positiu:");
            n =ent.nextInt();
            if(n<1) System.out.println("Ha de ser major que 0!!");
            else break;
        }while(true);

        System.out.println("Caràcters aleatoris:");
        //Generem i mostrem n lletres aleatòries entre la A i la Z
        for (int i = 0; i < n; i++) {
            //Calculem una lletra aleatòriament --> més aviat és l'índex de la lletra
            int lletra=r.nextInt('Z'-'A'+1);
            //Incrementem la casella de la lletra
            comptadors[lletra]++;
            //Mostrem la lletra apareguda
            System.out.format("%c", lletra + 'A' ); //System.out.format("%c", r.nextInt('Z'-'A'+1) + 'A' );

        }

        for (int i = 0; i < comptadors.length; i++) {
            if(comptadors[i]!=0)
                System.out.format("%nEl caràcter %c ha aparegut %d %s.", 'A'+ i, comptadors[i], ( comptadors[i] == 1 ? "vegada" : "vegades"));
        }


   }

}
