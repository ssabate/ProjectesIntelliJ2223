package nf3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercici8 {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        long numero, copia;
        int[] vector;
        int longitud=0;
        boolean negatiu;

        System.out.println("Nº introduït:");
        numero = copia = ent.nextLong();
        negatiu= numero<0;

        while(numero!=0){
            numero/=10;
            longitud++;
        }

        //Instaciem el vector ara que sabem quantes caselles necessitem
        vector=new int[longitud];

        //Recuperem el valor correcte del numero
        numero=copia;

        System.out.println("Vector:");
        for (int i = vector.length-1; i >= 0 ; i--) {
            vector[i] = (int)numero % 10;
            //Canviem el signe si el número és negatiu
            //i no ens trobem a la primera casella del vector
            if(negatiu && i!=0) vector[i]=vector[i]*-1;
            numero /= 10;
        }

        System.out.println(Arrays.toString(vector));

    }
}
