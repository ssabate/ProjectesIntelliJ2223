package com.iesebre;

import java.util.Arrays;
import java.util.Random;

public class ModularIV {

    public static void main(String[] args) {
        int[] varVector={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        demostracioParametres(varVector,5, 7);

        System.out.println(Arrays.toString(varVector));


    }

    //Mètode que assigna el valor a una casella aleatòria del param (vector)
    public static void demostracioParametres(int[] param, int valor){
        Random r=new Random();
        int pos=r.nextInt(param.length);
        demostracioParametres(param, pos, valor);

    }


    //Mètode que assigna el valor a la casella pos del param (vector)
    public static void demostracioParametres(int[] param, int pos, int valor){
//        int[] copia=new int[param.length];
//        for (int i = 0; i < copia.length; i++) {
//            copia[i]=param[i];
//        }
        param=new int[pos+1];
        param[pos]=valor;

        System.out.println(Arrays.toString(param));

    }

}
