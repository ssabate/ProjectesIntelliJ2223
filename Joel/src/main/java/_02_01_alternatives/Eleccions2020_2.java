package _02_01_alternatives;

import java.util.Scanner;

public class Eleccions2020_2 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int jiden, dump;

        //Llegim les dades, en l'ordre correcte!!
        jiden = ent.nextInt();
        dump = ent.nextInt();

        if(jiden > dump) System.out.println("Jiden");
        else if( dump > jiden) System.out.println("Drump");
        else System.out.println("No");


        //if( jiden >= dump ) System.out.println("Jiden");
        //if( jiden <= dump ) System.out.println("Drump");


    }
}
