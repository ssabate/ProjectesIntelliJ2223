package nf3;

import java.util.Scanner;

public class Exercici13Cadenes {

    public static void main(String[] args) {


        Scanner ent = new Scanner(System.in);
        String linia;

        //Lectura de dades
        do{
            System.out.println("Introduix una línia de text no buida:");
            linia= ent.nextLine().trim();
            if ( !linia.isEmpty() ) break;
            else System.out.println("Ha de ser una línia no buida!!");
        }while(true);

        String[] paraules=linia.split(" ");
        System.out.println("El text conté les paraules:");
        for (int i = 0; i < paraules.length; i++) {
            if( !paraules[i].trim().isEmpty())
                System.out.println(paraules[i]);
        }




    }
}
