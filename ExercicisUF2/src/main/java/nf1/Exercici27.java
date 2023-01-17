package nf1;

import static nf1.Exercici26.revesNumero;

public class Exercici27 {

    public static void main(String[] args) {

        System.out.println(numeroCapicua(020));
    }

    public static boolean numeroCapicua(int n){
        //Nota: un número és capicua si és igual que el seu revés.
        return n==revesNumero(n);
    }

}
