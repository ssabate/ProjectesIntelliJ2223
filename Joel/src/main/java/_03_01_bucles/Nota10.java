package _03_01_bucles;

import java.util.Scanner;

public class Nota10 {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int numero, comptTotal = 0, compt10s = 0;

        //Lectura i tractament de dades
        do{
            numero = ent.nextInt();
            if( numero ==10 ) {
                compt10s++;
            }
            if( numero >=0 && numero <=10 ) {
                comptTotal++;
            }

        }while( numero != -1 );

        //Mostrem el resultat
        System.out.println("TOTAL NOTES: " + comptTotal + " NOTES10: " + compt10s);

    }
}
