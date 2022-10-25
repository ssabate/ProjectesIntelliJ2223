package _03_01_bucles;

import java.util.Scanner;

public class AmbrosioTriangular {

    public static void main(String[] args) {

        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int numCasos;

        numCasos = ent.nextInt();
        for( ; numCasos >= 1; numCasos--){
            //Tractament de cada cas
            int cas = ent.nextInt();    //llegim el número de pisos
            int ferreros = 0, sumaPisos = 0;           //acumulador de ferreros
            for( int i = 1; i <= cas; i++){    //recorregut dels pisos en ordre ascendent (obligatori!!)
                sumaPisos += i;             //calcul dels ferreros del pis actual
                //sumaPisos = sumaPisos + i;
                ferreros += sumaPisos;    //acumulem els ferreros del pis actual als que ja teniem
                //ferreros = ferreros + sumaPisos;
            }
            System.out.println(ferreros);   //mostrem els ferreros del cas actual
        }
    }

}



