package nf1;

import java.util.Scanner;

public class BugEntersTextos {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner entNum = new Scanner(System.in);
        int n, comptador = 1;

        //nf1.Lectura de dades
        n = entNum.nextInt();

        //Tractament de dades
        while( comptador <= n ){
            //Mostrem el resultat
            System.out.println(entNum.next());

            comptador = comptador + 1;
        }
    }
}
