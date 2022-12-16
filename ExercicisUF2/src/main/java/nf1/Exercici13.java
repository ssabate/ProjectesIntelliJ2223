package nf1;

import static nf1.Exercici8.vectorDigits;

public class Exercici13 {

    public static void main(String[] args) {
        System.out.println(numVector(vectorDigits(12345)));  //--> 12345
        System.out.println(numVector(new int[]{1,2,3,4,5}));  //--> 12345
        System.out.println(numVector(vectorDigits(-12345)));  //--> 12345
        System.out.println(numVector(new int[]{-1,2,3,4,5}));  //--> 12345

        //numVector(vectorDigits(numero))  --> numero
    }

    public static int numVector(int[] vector){

        //Tractament de casos especials
        if(vector==null) return 0;

        //Comprovem si el vector conté un número negatiu
        boolean negatiu;
        if(negatiu = vector[0]<0) vector[0]*=-1;

        int suma=0, pot10=1;

        for (int i = vector.length-1; i >= 0 ; i--) {

            suma+=vector[i]*pot10;

            pot10 *= 10;

        }

        return suma*(negatiu?-1:1);
    }


}
