package _01_01_introduccio;

import java.util.Scanner;

public class Amanecer {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int s, dia, matiNit;  //--> notació camelCase

        //Lectura de dades (entrada)
        s = ent.nextInt();

        //Mostrem el resultat (sortida)

        //Obtenim el dia, dividint els segons llegits per la quantitat de segons d'un dia, i sumant 1
        dia = (s / 86400) + 1;
        //A matiNit guardem els segons que sobren després de descomptar dies sencers, gràcies a l'operació %
        matiNit = s % 86400;

        //Si els segons sobrants són inferiors a 43200 (que són els segons que hi ha a la meitat d'un dia) vol dir que
        //estem a la primera meitat del dia (matí) i sinó a la segona (nit)
        if(matiNit < 43200){
            System.out.print("mati");
        } else {
            System.out.print("nit");
        }
        System.out.println(" del dia "+ dia);


    }
}
