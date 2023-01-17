package nf1;

import java.util.Scanner;

import static nf1.Exercici26.revesNumero;
import static nf1.Exercici27.numeroCapicua;

public class Exercici47 {

    //Vars globals
    static int num;

    public static void main(String[] args) {


        inicialitzarVariables();

        tractarPrimerElement();

        while(!elementFinal()){
            tractarElement();
        }
        tractamentFinal();
    }

    private static void tractamentFinal() {
        System.out.println(num);
    }

    private static void tractarElement() {
        num=num+revesNumero(num);
        System.out.println(num);
    }

    private static boolean elementFinal() {
        return numeroCapicua(num);
    }

    private static void tractarPrimerElement() {
        num=num+revesNumero(num);
    }

    private static void inicialitzarVariables() {
        Scanner ent = new Scanner(System.in);

        System.out.println("Introduix un enter:");
        num=ent.nextInt();
    }


}
