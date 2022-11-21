package nf3;

import java.util.Scanner;

public class Exercici1 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int[] vector;
        int num, index=0, candidat=2;

        do {
            System.out.println("Introduix un número enter major que 0:");
            num =ent.nextInt();
            if(num<1) System.out.println("Ha de ser major que 0!!");
            else break;
        }while(true);

        //instanciem el vector ara que sabem el valor del número a tractar
        vector = new int[Math.round((float)(Math.log(num) / Math.log(2)))];

        System.out.format("Descomposició factorial de %d:%n", num);
        while(num!=1){
            if( num % candidat == 0){
                num /= candidat;
                vector[index] = candidat;
                index++;
            } else candidat++;
        }

        //Mostro la descomposició en factors primers recorrent el vector de dreta a esquerra
        for (int i = index-1; i >= 0 ; i--) {
            System.out.format("%d * ", vector[i]);
        }
        System.out.println("1");
    }

}
