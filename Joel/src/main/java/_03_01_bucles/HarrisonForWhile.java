package _03_01_bucles;

import java.util.Scanner;

public class HarrisonForWhile {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int diners, milio = 1000000;

        //Entrada de dades
        diners = ent. nextInt();

        //Mostrem la sortida
        while( milio <= diners ){
            System.out.println(milio);
            milio = milio + 1000000;
        }

    }
}
