package nf1;

import java.util.Random;
import java.util.Scanner;

import static nf1.GeneraContrasenya.generaContrasenya;

public class Exercici1 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int quantitat;

        do{
            System.out.println("Introduix un número major o igual que 1:");
            quantitat=ent.nextInt();
            if(quantitat<1) System.out.println("Ha de ser major que 1!!");
            else break;
        }while(true);

        char c1='9', c2='6';

/*
        for (int i = 0; i < quantitat; i++) {
            System.out.format("%c", retornaCaracter('9','('));
        }
*/
        System.out.println(generaContrasenya(quantitat,c1,c2));
    }

    //Exercici 1
    public static char retornaCaracter(){
        Random r=new Random();
        return (char) (r.nextInt('{' - ' ' + 1 ) + ' ' );
    }

    //El tipo de reorn del mètode no el diferència de l'anterior, només el número i tipo dels paràmetres
/*    public static void retornaCaracter(){
        Random r=new Random();
        //return (char) (r.nextInt('{' - ' ' + 1 ) + ' ' );
    }
*/
    //Exercici 1bis
    public static char retornaCaracter(char car1, char car2){
        Random r=new Random();

        if(car1>=car2) return (char) (r.nextInt(car1 - car2 + 1 ) + car2 );
        else return (char) (r.nextInt(car2 - car1 + 1 ) + car1 );
    }

}
