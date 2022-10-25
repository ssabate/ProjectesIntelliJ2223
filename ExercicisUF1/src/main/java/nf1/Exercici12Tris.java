package nf1;

import java.util.Scanner;

public class Exercici12Tris {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num, suma=0;

        System.out.println("Introduix un enter:");
        num = ent.nextInt();


        for (int div = 1; div < num ; div++) {
            if( num % div == 0) suma = suma + div;
        }

        if(num == suma) System.out.println(num + " és perfecte");
        else System.out.println(num + " no és perfecte");

    }
}
