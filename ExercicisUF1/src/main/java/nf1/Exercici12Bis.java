package nf1;

import java.util.Scanner;

public class Exercici12Bis {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num;

        System.out.println("Introduix un enter:");
        num = ent.nextInt();

        System.out.println("Els divisors de "+num+" són:");
        for (int i = 1; i <= num ; i++) {
            if( num % i == 0) System.out.println(i);
        }

    }
}
