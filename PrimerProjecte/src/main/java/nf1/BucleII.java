package nf1;

import java.util.Scanner;

public class BucleII {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int diners;

        //Entrada de dades
        diners = ent. nextInt();

        //Mostrem la sortida
        for( int milio = 1000000 ;  milio <= diners ; milio = milio + 1000000  ){
            System.out.println(milio);
        }

        /*
        {
            int milio = 1000000 ;
            while(milio <= diners   ){
                System.out.println(milio);
                milio = milio + 1000000;
            }
        }
        */





        /* Sintaxi del for
        for( inicialització vars control ;   condició ; actualització de vars control  ){
            instruccions que s'han de repetir'
        }
         */


    }
}
