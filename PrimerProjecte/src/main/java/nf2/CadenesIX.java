package nf2;

import java.util.Scanner;

public class CadenesIX {

    public static void main(String[] args) {
        //Programa que demana una línia de text i un caràcter i diu si apareix el caràcter dins del text

        //Cadena de caràcters --> seqüència --> esquema búsqueda,
        // per què he de tractar els caràcters de la cadena però buscant un en concret, i en cas de trobar-lo acabem
        //inicialitzarVariables();
        Scanner ent = new Scanner(System.in);
        String linia;
        char c;
        int index = 0;

        System.out.println("Escriu una línia de text (acabat en INTRO):");
        linia = ent.nextLine();
        if(linia.length() == 0){
            System.out.println("No hi ha res que buscar. Sortim del programa...");
            System.exit(0);
        }

        System.out.println("Escriu un sol caràcter (acabat en INTRO):");
        String resposta=ent.nextLine();
        if(resposta.length() == 0){
            System.out.println("No has buscat res. Sortim del programa...");
            System.exit(0);
        }
        //sinó actuem en conseqüència
        c = resposta.charAt(0);
        //fi inicialitzarVariables();

        //En el mètode indexOf(char) busquem el caràcter dins l'String
        index = linia.indexOf(c);

        //Si el troba l'index val un valor diferent a -1
        if( index != -1 )
            System.out.format("El caràcter %c s'ha trobat dins del text %s a la posició %d%n", c, linia, index+1);
        else System.out.format("El caràcter %c no s'ha trobat dins del text %s%n", c, linia);

    }


}
