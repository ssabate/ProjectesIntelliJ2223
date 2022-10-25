package sense_bucles;

import java.util.Scanner;

public class Decada90 {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int n, resto;

        //Llegim dades d'entrada
        n = ent.nextInt();
        //Obtenim 2 últims dígits al residu de dividir entre 100
        resto = n % 100;

        //tractem l'entrada i mostrem la sortida
        if(resto >= 90 && resto <= 99){
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}
