package _02_01_alternatives;

import java.util.Scanner;

public class Eleccions2020_3 {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent=new Scanner(System.in);
        int jiden, drump, banders;

        //1. Lectura de dades (entrada)
        jiden = ent.nextInt();
        drump = ent.nextInt();
        banders = ent.nextInt();

        //2. Mostrem resultat (sortida)
        if( jiden>drump && jiden>banders ){
            System.out.println("Jiden");
        }else{  //Aquí sabem que Jiden no ha guanyat
            if( drump>banders ){
                System.out.println("Drump");
            }else{  //Aquí sabem que ni Jiden ni Drump han guanyat
                System.out.println("Banders");
            }
        }

    }
}
