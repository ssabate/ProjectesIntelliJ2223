package nf1;

import java.util.Scanner;

public class Practica {

    //Programa que demana a l'usuari 2 números enters
    //i escriu true si són divisibles entre ells i false
    //en cas contrari
    //a % b == 0
    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent=new Scanner(System.in);
        int a, b;
        boolean resultat;

        //1r pas. Demanem les dades a l'usuari
        System.out.println("Introduix 2 números enters:");
        a = ent.nextInt();
        b = ent.nextInt();

        //2n pas. Fem l'operació i la mostrem
        resultat = a % b == 0;
        System.out.println(resultat); //sout(a % b == 0)
    }



}
