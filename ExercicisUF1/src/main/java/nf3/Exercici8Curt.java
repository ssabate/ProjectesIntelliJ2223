package nf3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercici8Curt {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        long numero;
        int[] vector;
        boolean negatiu;
        String numeroText;

        System.out.println("Nº introduït:");
        numero = ent.nextLong();
        negatiu = numero<0;
        numeroText = Long.toString(numero);
        System.out.print("El número introduit és");
        System.out.println(negatiu ? " negatiu":" positiu o 0");

        //Instaciem el vector ara que sabem quantes caselles necessitem
        //Si el número era negatiu descomptem el signe
        //if(negatiu) vector=new int[numeroText.length()-1];
        //else vector=new int[numeroText.length()];
        vector=new int[numeroText.length() - (negatiu ? 1 : 0)];

        System.out.println("Vector:");
        for (int i = vector.length-1; i >= 0 ; i--) {
            //vector[i] = Integer.parseInt(Character.toString(numeroText.charAt(i + (negatiu ? 1 : 0) )));
            vector[i] = Integer.parseInt(  numeroText.substring(i+(negatiu ? 1 : 0), i+1+(negatiu ? 1 : 0)));
            //Canviem el signe si el número és negatiu i ens trobem a la primera casella del vector
            if(negatiu && i==0) vector[i]=vector[i]*-1;
        }

        System.out.println(Arrays.toString(vector));

    }
}
