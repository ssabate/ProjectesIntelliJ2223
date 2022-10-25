package _01_01_introduccio;

import java.util.Scanner;

public class MultiplicaPer3 {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int num;

        //Primer pas: llegir un número enter
        num = ent.nextInt();


        //Segon pas: mostrar el número multiplicat per 3
        System.out.println( num * 3 );

    }

}
