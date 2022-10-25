package nf1;

import java.util.Scanner;

public class Exercici28 {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        long primer, altres, suma = 0, comptador = 0;

        //Demanem primer valor
        System.out.println("Introduix un número enter:");
        primer=altres=ent.nextLong();

        do {
            suma+=altres;
            System.out.println(suma);       //Mostro la suma parcial
            comptador++;

            System.out.println("Introduix un número enter (igual a "+primer+" per acabar):");
            altres=ent.nextLong();
        }while( primer != altres);

        System.out.println(suma += altres);           //Mostro la suma parcial
        comptador++;

        System.out.println(suma+" "+ comptador );


    }
}
