package nf1;

import java.util.Arrays;

public class Exercici14 {

    public static void main(String[] args) {
        int[] vector = {1, 8, 3, 5, 6, 7, 9, 12, 4};
        eliminaNoMultiples(vector, 3);
        System.out.println(Arrays.toString(vector));
    }


    public static void eliminaNoMultiples(int[] vector, int num) {

        if (vector == null || num == 0)
            return;    //Si el vector és null, o busquem múltiples del 0, acabem i no cal fer res

        int contMult = 0;             //Comptador de valors múltiples trobats
        for (int i = 0; i < vector.length; i++) {

            if (vector[i] % num == 0) {   //Si el valor de la casella actual és múltiple el copiem a la casella indicada pel
                //comptador de múltiples, i si cal posem l'actual a -1. Finalment incrementem
                //el comptador de múltiples
                vector[contMult] = vector[i];
                if (i != contMult) vector[i] = -1;
                contMult++;
            } else   //Si no és múltiple directament posem la casella a -1
                vector[i] = -1;
        }

    }

    public static void eliminaNoMultiplesV2(int[] vector, int num) {

        if (vector == null || num == 0)
            return;    //Si el vector és null, o busquem múltiples del 0, acabem i no cal fer res

//        for (int i = 0; i < vector.length; i++) {
//
//            if (vector[i] % num != 0) vector[i] = -1;
//        }
        int primeraBuida = -1;             //Comptador de valors múltiples trobats
        for (int i = 0; i < vector.length; i++) {

            if (vector[i] % num == 0) {   //Si el valor de la casella actual és múltiple el copiem a la casella indicada pel
                //comptador de múltiples, i si cal posem l'actual a -1. Finalment incrementem
                //el comptador de múltiples
                if (primeraBuida != -1) {
                    vector[primeraBuida] = vector[i];
                    if (primeraBuida != i) vector[i] = -1;
                    int j = primeraBuida+1;
                    for (; j < vector.length && vector[j]!=-1; j++);
                    primeraBuida = j;
                }

            } else {   //Si no és múltiple directament posem la casella a -1
                vector[i] = -1;
                if (primeraBuida == -1) primeraBuida = i;
            }

        }


    }
}