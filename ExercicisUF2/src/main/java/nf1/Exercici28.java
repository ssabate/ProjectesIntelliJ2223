package nf1;

import java.util.Scanner;

import static nf1.Exercici26.revesNumero;
import static nf1.Exercici27.numeroCapicua;

public class Exercici28 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num;

        //System.out.println("Introduix un enter:");
        //num=ent.nextInt();

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            System.out.format("Número inicial: %d%n", i);
            num=i;
            num=num+revesNumero(num);
            while(!numeroCapicua(num)){
                num=num+revesNumero(num);
            }
            System.out.format("Número final: %d%n%n", num);
        }



    }


}
