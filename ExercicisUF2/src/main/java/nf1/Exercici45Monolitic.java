package nf1;

import java.util.Scanner;

public class Exercici45Monolitic {

    public static void main(String[] args) {
        int a,b,compt=0;
        Scanner ent = new Scanner(System.in);

        do{
            System.out.println("Introduix un parell de números enters:");
            a=ent.nextInt();
            b=ent.nextInt();
            compt++;
            if(a==b || a==0 || b==0) break;
        }while(true);

        System.out.format("S'han introduit %d parelles.", compt);


    }
}
