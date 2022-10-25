package _03_01_bucles;

import java.util.Scanner;

public class BucleNumeroPositiu {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int n, comptador = 1, comptNumPos = 0;
        int valor;

        //Lectura de dades
        n = ent.nextInt();

        //Tractament de dades
        while( comptador <= n ){
            valor = ent.nextInt();
            if( valor > 0 ) {
                comptNumPos = comptNumPos + 1;
            }

            comptador = comptador + 1;
        }
        //Mostrem el resultat
        System.out.println(comptNumPos);

    }
}
