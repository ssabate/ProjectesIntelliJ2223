package nf1;

import java.util.Scanner;

public class Exercici11 {


    public static void main(String[] args) {

        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        double base;

        //Entrada de dades
        System.out.println("Introduix un número qualsevol:");
        base = ent.nextDouble();

        for (int i = 0; i <= 10 ; i++) {
            System.out.println(Math.pow( base, i));

        }


    }
}
