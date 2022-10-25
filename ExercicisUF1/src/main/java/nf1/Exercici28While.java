package nf1;

import java.util.Scanner;

public class Exercici28While {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        long numero, altres, suma, comptador = 1;

        //Demanem primer valor
        System.out.println("Introduix un número enter:");
        numero=ent.nextLong();
        System.out.println(suma=numero);
        altres=numero+1;        //forcem a entrar dins del bucle

        while( numero != altres ) {
            System.out.println("Introduix un número enter (igual a "+numero+" per acabar):");
            altres=ent.nextLong();

            suma+=altres;
            System.out.println(suma);       //Mostro la suma parcial
            comptador++;
        }

        System.out.println(suma+" "+ comptador );


    }
}
