package nf3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercici8Curt {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        long numero, copia;
        int[] vector;
        boolean negatiu;

        System.out.println("Nº introduït:");
        numero = ent.nextLong();
        negatiu= numero<0;

        //Instaciem el vector ara que sabem quantes caselles necessitem
        vector=new int[(numero+"").length()];

        System.out.println("Vector:");
        for (int i = vector.length-1; i >= 0 ; i--) {
            vector[i] = Integer.parseInt((numero+"").charAt(i)+"");
            //Canviem el signe si el número és negatiu
            //i no ens trobem a la primera casella del vector
            if(negatiu && i!=0) vector[i]=vector[i]*-1;

        }

        System.out.println(Arrays.toString(vector));

    }
}
