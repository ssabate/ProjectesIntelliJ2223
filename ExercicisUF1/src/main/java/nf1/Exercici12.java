package nf1;

import java.util.Scanner;

public class Exercici12 {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int num, fact = 2;

        //Demanem introducció dades
        System.out.println("Introduix un enter");
        num = ent.nextInt();

        //Mostrem la solució
        if (num == 0) System.out.println("0 = 0");
        else {
            //Tractem diferent positius i negatius
            if ( num > 0) System.out.print(num + " = 1");
            else{
                System.out.print(num + " = -1");
                //Passem el número a positiu
                num = num * -1; // num *= -1;
            }
            while (num != 1) {
                if (num % fact == 0) {
                    System.out.print(" * " + fact);
                    num = num / fact;    // num /= fact;
                } else fact++;  // fact = fact + 1;
            }
        }
    }
}
