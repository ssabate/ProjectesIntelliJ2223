package nf1;

import java.util.Scanner;

public class Exercici11SensePow {


    public static void main(String[] args) {

        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        double base, x = 1;

        //Entrada de dades
        System.out.println("Introduix un número qualsevol:");
        base = ent.nextDouble();

        System.out.println("1");
        for (int i = 1; i <= 10 ; i++) {
            System.out.println( x * base);
             x = x * base;
        }
    }
}
