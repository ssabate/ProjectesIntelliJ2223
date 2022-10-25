package _03_01_bucles;

import java.util.Scanner;

public class Ambrosio {

    public static void main(String[] args) {

        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int numCasos;

        numCasos = ent.nextInt();
        for( ; numCasos >= 1; numCasos--){
            //Tractament de cada cas
            int cas = ent.nextInt();    //llegim el número de pisos
            int ferreros = 0;           //acumulador de ferreros
            for( ; cas >= 1; cas--){    //recorregut dels pisos
                ferreros = ferreros + cas * cas;    //acumulem els ferreros del pis actual als que ja teniem
            }
            System.out.println(ferreros);   //mostrem els ferreros del cas actual
        }
    }

}



