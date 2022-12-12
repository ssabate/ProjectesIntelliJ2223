package nf1;

import java.util.Scanner;

public class Exercici6 {

    public static boolean primer(int numero){
        int comptador=0;

        for (int i = 1; i <= numero && comptador<=2; i++) {
            if( numero % i == 0) comptador++;
        }

        return comptador==2 ;
    }

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num;

        do {
            System.out.println("Introduix un enter positiu:");
            num = ent.nextInt();
            if( num<=0 ){
                System.out.println("Els enters positius són l'1, 2, 3, 4, ...., "+ Integer.MAX_VALUE);
            }
            else break;     //sortim del bucle per què la condició de continuar dins del bucle és falsa

        }while( true );

        System.out.print(num);
        if( primer(num) ) System.out.println(" és primer.");
        else  System.out.println(" no és primer.");
    }



}
