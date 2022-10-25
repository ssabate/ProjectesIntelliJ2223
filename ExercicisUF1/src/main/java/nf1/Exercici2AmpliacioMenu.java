package nf1;

import java.util.Scanner;

public class Exercici2AmpliacioMenu {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int opcio;
        byte comptador;

        do {
            //Mostrar menú
            System.out.println("0. Sortir");
            System.out.println("1. Solució en for");
            System.out.println("2. Solució en while");
            System.out.println("3. Solució en do_while");
            System.out.println("Tria una opció:");


            opcio = ent. nextInt();
            comptador = -5;

            //Tractar opcions
            switch( opcio ){
                case 0:
                    System.out.println("Adéu!!");
                    break;
                case 1:
                    //Mostrar la sortida
                    for( ;comptador <= 5; comptador = (byte) (comptador + 1) ){   // condició, on apareix la variable de control
                        System.out.print(comptador+ " és ");
                        if(comptador % 2 == 0) System.out.println(" parell");
                        else System.out.println(" imparell");
                    }
/*
                    for( int i = comptador ; i <= 5 ; i = i + 1 ){   // condició, on apareix la variable de control
                        System.out.print(i+ " és ");
                        if(i % 2 == 0) System.out.println(" parell");
                        else System.out.println(" imparell");
                    }
*/

                    break;
                case 2: //while

                    //Mostrar la sortida
                    while( comptador <= 5 ){   // condició, on apareix la variable de control
                        System.out.print(comptador+ " és ");
                        if(comptador % 2 == 0) System.out.println(" parell");
                        else System.out.println(" imparell");
                        comptador = (byte) (comptador + 1); //actualització de la variable de control
                    }

                    break;
                case 3:
                    //Mostrar la sortida
                    do{   // condició, on apareix la variable de control
                        System.out.print(comptador+ " és ");
                        if(comptador % 2 == 0) System.out.println(" parell");
                        else System.out.println(" imparell");
                        comptador = (byte) (comptador + 1); //actualització de la variable de control
                    }while( comptador <= 5 );

                    break;
                default:
                    System.out.println("Opció incorrecta!!");
            }

        }while( opcio != 0);



    }

}
