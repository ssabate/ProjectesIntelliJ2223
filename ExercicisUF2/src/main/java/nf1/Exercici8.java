package nf1;

import java.util.Arrays;

public class Exercici8 {

    public static void main(String[] args) {
//        int num=-12345670;
//        System.out.println(Arrays.toString(vectorDigits(num)));
//
//        int[] v=vectorDigits(num);
//        for (int i = 0; i < v.length; i++) {
//            System.out.println(v[i]);
//        }

        System.out.println(Arrays.toString(vectorDigits(-1000)));

    }

    public static int[] vectorDigits(int numero){
        //Declarem un vector de la mida exacta
        String numACadena = Integer.toString(numero);   //cadena que representa al número rebut per paràmetre
        int[] vector=new int[ numACadena.length() - (numero<0 ? 1 : 0)];  // (numero+"").length()

        for (int i = 0; i < vector.length ; i++) {
            vector[i] = Character.getNumericValue(numACadena.charAt(i+(numero<0 ? 1 : 0)));
        }

        //Canviem el signe al primer dígit diferent de 0 de la part esquerra del número
        if(numero<0) vector[0]=vector[0]*-1;

        return vector;
    }

}
