package _03_00_iniciacio_bucles;

import java.util.Scanner;

public class  DiguesPatata {
    public static void main(String[] args) {
        int numero_vegades;
        String paraula;
        Scanner scanner = new Scanner(System.in);
        numero_vegades = scanner.nextInt();

        //Faig el bucle de numero_vegades + 1 passos per llegir la línia de text que perdíem
        while(numero_vegades != 0){
            numero_vegades--;
            paraula = scanner.nextLine();
            System.out.println(paraula);

        }
    }
}