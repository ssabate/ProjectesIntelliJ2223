package nf1;

import java.util.Locale;
import java.util.Scanner;

public class Lectura {

    public static void main(String[] args) {

        //1. Declaro una variable de tipo Scanner
        Scanner ent = new Scanner(System.in);
        int numero;
        double real, suma;
        String text;

        //2. Vaig a llegir una dada... entera (int)
        // i la guardo a una variable entera
        System.out.println("Introduix un número enter i un número real:");
        numero = ent.nextInt();
        real = ent.nextDouble();
        text = ent.nextLine();



        //3. Treballo en la variable de la manera que vulgue
        System.out.println("La variable val "+numero);
        System.out.println("la suma dels valors és "+numero+real);  //incorrecte, concatena enlloc de sumar!!
        System.out.println("la suma dels valors és "+(numero+real)); //correcte, mostra la suma

        suma = numero + real;                                       //correcte, però més llarg
        System.out.println("la suma dels valors és " + suma);

    }
}
