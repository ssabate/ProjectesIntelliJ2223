package _03_01_bucles;

import java.util.Scanner;

public class SumaPataques {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int n, comptador = 1;

        //Lectura de dades
        n = ent.nextInt();

        //Tractament de dades
        while (comptador <= n) {

            //tractar_cas_prova;
            int n2, comptador2 = 1;
            int suma = 0, pataques;

            //Lectura de dades
            n2 = ent.nextInt();

            //Tractament de dades
            while (comptador2 <= n2) {
                pataques = ent.nextInt();
                suma = suma + pataques;
                comptador2 = comptador2 + 1;
            }
            System.out.println( suma );
            //fi_cas_prova

            comptador = comptador + 1;
        }

    }
}
