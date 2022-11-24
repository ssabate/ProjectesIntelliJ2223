package nf3;

import java.util.Random;
import java.util.Scanner;

public class Exercici9Bis {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Random r=new Random();
        int[] comptadors=new int['Z'-'A'+1];
        char[] lletres;
        int n, index=0;

        do {
            System.out.println("Introduix un número enter positiu:");
            n =ent.nextInt();
            if(n<1) System.out.println("Ha de ser major que 0!!");
            else break;
        }while(true);

        //Instanciem el vector on guardem les lletres aparegudes
        lletres=new char[n];

        System.out.println("Caràcters aleatoris:");
        //Generem i mostrem n lletres aleatòries entre la A i la Z
        for (int i = 0; i < n; i++) {
            //Calculem una lletra aleatòriament --> més aviat és l'índex de la lletra
            int lletra=r.nextInt('Z'-'A'+1);
            //Incrementem la casella de la lletra
            comptadors[lletra]++;
            //Mostrem la lletra apareguda
            System.out.format("%c", lletra + 'A' ); //System.out.format("%c", r.nextInt('Z'-'A'+1) + 'A' );
            //Guardem la lletra generada alaetòriament al vector de lletres
            lletres[index++] = (char)(lletra + 'A');
        }

        //Mostrem el resultat demanat
        for (int i = 0; i < lletres.length; i++) {
            //Només mostrem la lletra si és la primera vegada que apareix, mirant el comptador d'aparicions
            if(  comptadors[ lletres[i]-'A' ] != 0   ){
                System.out.format("%nEl caràcter %c ha aparegut %d %s.", lletres[i], comptadors[ lletres[i] - 'A'  ],
                        ( comptadors[ lletres[i] - 'A'] == 1 ? "vegada" : "vegades"));
                //Posem el comptador de la lletra actual a 0 per a no tornar-la a mostrar en cas estigue repetida
                comptadors[ lletres[i]-'A' ] = 0;
            }
        }


   }

}
