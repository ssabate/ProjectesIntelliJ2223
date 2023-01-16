package nf1;

import static nf1.Exercici8.vectorDigits;

public class Exercici13 {

    public static void main(String[] args) {
//        System.out.println(numVector(vectorDigits(12345)));  //--> 12345
//        System.out.println(numVector(new int[]{1,2,3,4,5}));  //--> 12345
//        System.out.println(numVector(vectorDigits(-12345)));  //--> 12345
        System.out.println(numVector(new int[]{0,0,0,-4,1}));  //--> 12345

        //numVector(vectorDigits(numero))  --> numero
    }

    public static int numVector(int[] vector){

        //Tractament de casos especials
        if(vector==null) return 0;

        //Comprovem si el vector conté un número negatiu
        int j=0;
        for(;j<vector.length && vector[j]==0;j++);         //Saltem els dígits iguals a 0 començant per l'esquerra
        boolean negatiu=false;
        if(j<vector.length && (negatiu = vector[j]<0)) vector[j]*=-1;

        int suma=0, pot10=1;

        for (int i = vector.length-1; i >= 0 ; i--) {

            suma+=vector[i]*pot10;

            pot10 *= 10;

        }

        return suma*(negatiu?-1:1);
    }


}
