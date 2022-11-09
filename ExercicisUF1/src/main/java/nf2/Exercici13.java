package nf2;

import java.util.Scanner;

public class Exercici13 {

    public static void main(String[] args) {


        Scanner ent = new Scanner(System.in);
        String linia;

        //Lectura de dades
        do{
            System.out.println("Introduix una línia de text no buida:");
            linia= ent.nextLine().trim();
            if ( !linia.isEmpty() ) break;
            else System.out.println("Ha de ser una línia no buida!!");
        }while(true);

        //Tractament de les dades
        //inicialitzarVariables();
        int indexIn = 0, indexFin = linia.indexOf(' '), comptador = 1;
        //tractarPrimerElement();
        if( indexFin != -1)     //Si true vol dir que no estem a l'última paraula
            System.out.println(linia.substring(indexIn, indexFin));
        else    //El text només conté una paraula
            System.out.println(linia);
        // while (!elementFinal()){
        while( indexFin != -1 ) {
            //tractarSeguentElement();
            indexIn = indexFin + 1;
            indexFin = linia.indexOf(' ', indexFin + 1);
            //if(linia.substring(indexIn, indexFin).trim().isEmpty())
            //Si indexIn és igual a indexFin és per què hi ha més d'un espai
            //en blanc entre les paraules
            if( indexIn == indexFin ) continue;

            comptador++;        //incremento el comptador de paraules
            if( indexFin != -1)     //Si true vol dir que no estem a l'última paraula
                System.out.println(linia.substring(indexIn, indexFin));
            else    //Hem arribat a la última paraula del text
                System.out.println(linia.substring(indexIn, linia.length()));
            //}
        }
        //tractamentFinal();
        System.out.format("%nEl text%n%s%nconté %d paraules.%n", linia, comptador);



    }
}
