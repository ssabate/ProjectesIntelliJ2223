package nf1;

import java.util.Scanner;

public class Exercici45Modular {

    //Variables globals
    static int a, b, compt;


    public static void main(String[] args) {

        inicialitzarVariables();

        do{
            tractarElement();
        }while(!elementFinal());

        tractamentFinal();

    }

    private static void tractamentFinal() {
        System.out.format("S'han introduit %d parelles.", compt);
    }

    private static boolean elementFinal() {
        return a==b || a==0 || b==0;
    }

    private static void tractarElement() {
        Scanner ent = new Scanner(System.in);

        System.out.println("Introduix un parell de números enters:");
        a=ent.nextInt();
        b=ent.nextInt();
        compt++;
    }

    private static void inicialitzarVariables() {
        compt=0;
    }

}
