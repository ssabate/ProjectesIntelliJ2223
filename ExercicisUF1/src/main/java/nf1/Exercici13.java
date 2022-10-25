package nf1;

import java.util.Scanner;

public class Exercici13 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num, comptador=0;

        do {
            System.out.println("Introduix un enter positiu:");
            num = ent.nextInt();
            if( num<=0 ){
                System.out.println("Els enters positius són l'1, 2, 3, 4, ...., "+ Integer.MAX_VALUE);
            }
            else break;     //sortim del bucle per què la condició de continuar dins del bucle és falsa

        }while( true );



        for (int i = 1; i <= num && comptador<=2; i++) {
            if( num % i == 0) comptador++;
        }

        System.out.print(num);
        if( comptador==2 ) System.out.println(" és primer.");
        else  System.out.println(" no és primer.");
    }
}
