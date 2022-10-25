package sense_bucles;

import java.util.Locale;
import java.util.Scanner;

public class DimensioInversa {

    public static void main(String[] args) {

        //Canviem l'idioma del programa
        Locale.setDefault( Locale.ENGLISH);

        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        double numero;

        //Lectura de dades
        //System.out.println("Introduix un número:");
        numero = ent.nextDouble();

        //Mostrem el resultat
        System.out.println(1 / numero);

    }
}
