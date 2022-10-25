package _02_01_alternatives;

import java.util.Scanner;

public class Divisible1_10 {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int n;

        //Llegim dades d'entrada
        n = ent.nextInt();

        //tractem l'entrada i mostrem la sortida
        if(n % 9 == 0 && n % 8 == 0 && n % 7 == 0 && n % 5 == 0){
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        /*if(n % 9 != 0 || n % 8 != 0 || n % 7 != 0 || n % 5 != 0){
            System.out.println("NO");
        } else {
            System.out.println("SI");
        }*/
    }
}
