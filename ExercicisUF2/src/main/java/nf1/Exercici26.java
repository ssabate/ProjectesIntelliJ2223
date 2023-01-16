package nf1;

import static nf1.Exercici13.numVector;
import static nf1.Exercici25.longitudNumero;
import static nf1.Exercici8.vectorDigits;

public class Exercici26 {

    public static void main(String[] args) {
        System.out.println(revesNumeroV2(-1234));
    }

    public static int revesNumero(int n){

        //Transformen el paràmetre rebut a vector d'enters
        int[] vector=vectorDigits(n);

        //Girar el vector
        for(int i=0,  j=vector.length-1; i<j; i++, j--){
            int temp=vector[i];
            vector[i]=vector[j];
            vector[j]=temp;
        }
        //Mirem si el paràmetre era negatiu, i fem els canvis necessaris
        if(n<0) {
            vector[vector.length - 1] = vector[vector.length - 1] * -1;     //Passem el dígit de la dreta a positiu
            //Busquem el primer dígit de l'esquerra diferent de 0 i el passem a negatiu
            int j=0;
            for(;j<vector.length && vector[j]==0;j++);
            if(j<vector.length) vector[j]=vector[j]*-1;
        }

        //Transformar el vector girat a número
        return numVector(vector);
    }

    public static int revesNumeroV2(int n){
        if(n>=-9 && n<=9) return n;

        int resultat=0;
        int potencia=(int) Math.pow(10, longitudNumero(n)-1);

        while(n!=0){
            resultat = resultat + n%10 * potencia;
            n=n/10;
            potencia=potencia/10;
        }

        return resultat;
    }


}
