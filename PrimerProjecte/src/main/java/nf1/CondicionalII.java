package nf1;

import java.util.Scanner;

public class CondicionalII {

    public static void main(String[] args) {
        //Estructura condicional --> si l'expressió boolean és true
        //                          executem el codi de dins les claus
        //                          de l'if i si és false el dofi de
        //                          dins les claus de l'else. Per últim
        //                          continuem l'execució a continuació de }
        //if( expressió booleana){
        //    codi de l'if....
        //} else {
        //    codi de l'else
        //}
        //codi continuació

        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int a, b;

        //1. Demanem valors a l'usuari
        System.out.println("Introduix 2 números enters:");
        a = ent.nextInt();
        b = ent.nextInt();

        //2. Escrivim "Són divisibles" si els 2 números ho són
        // i sinó escrivim "No divisibles"
        if( a % b == 0 ){
            System.out.println("Son divisibles");
        } else {
            System.out.println("No divisibles");
        }

        if( a % b != 0 ){
            System.out.println("No divisibles");
        } else {
            System.out.println("Son divisibles");
        }


    }


}
