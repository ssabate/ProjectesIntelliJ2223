package nf1;

import java.util.Scanner;

public class Exercici3 {

    public static int demanaValor(String text, int limitSuperior){
        int valor;
        Scanner entrada = new Scanner(System.in);
        //Demanem quin alumne vol consultar
        do{
            System.out.format("\nIntroduix %s a consultar (0-%d):\n", text, limitSuperior-1);
            valor=entrada.nextInt();
        }while(valor<0 || valor>=limitSuperior);

        return valor;
    }

    public static void main(String[] args) {
        int alumne,mp,nota;
        final int F=20;
        final int C=14;
        final int P=10;
        //Demanem quin alumne vol consultar
        alumne = demanaValor("l'alumne", F);
//        alumne = demanaValor("l'alumne");
//        alumne = demanaValor( F);


        //Demanem quin mòdul vol consultar
        mp = demanaValor("el mòdul", C);

        //Demanem quina nota vol consultar
        nota = demanaValor("la nota", P);

    }

}
