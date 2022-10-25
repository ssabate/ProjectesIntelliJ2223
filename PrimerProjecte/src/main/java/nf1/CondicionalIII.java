package nf1;

import java.util.Scanner;

public class CondicionalIII {

    public static void main(String[] args) {
        /*
        switch(expressió){
            case valor1:    //Només podem tractar un sol valor
                codi;
                break;      //OPCIONAL!!
            case valor2:

            default:        //OPCIONAL!!
        }
        */
        //Declaració de variables
        Scanner ent=new Scanner(System.in);
        int numero;
        String nom;

        //Li diem a l'usuari que escrigue un número enter
        System.out.println("Escriu un número enter:");
        numero = ent.nextInt();

        //Ara direm si numero val o no 1 o 2
        switch(numero){
            case 1:         //if(numero==1) System.out.println("Val 1");
                System.out.println("Val 1");
                break;
            case 2:         //if(numero==2) System.out.println("Val 2");
                System.out.println("Val 2");
                break;
            default:
                System.out.println("No val ni 1 ni 2");
                //break;    //
        }

        //Li diem a l'usuari que escrigue el seu nom
        System.out.println("Escriu el teu nom:");
        nom = ent.nextLine();

        //Ara direm si és diu o no Donald
        switch(nom){
            case "Donald":
                System.out.println("Te dius Donald");
                break;
            default:
                System.out.println("No ets Donald");
        }

        //If else equivalent al switch
        if( nom.equals("Donald")) System.out.println("Te dius Donald");
        else System.out.println("No ets Donald");


    }
}
