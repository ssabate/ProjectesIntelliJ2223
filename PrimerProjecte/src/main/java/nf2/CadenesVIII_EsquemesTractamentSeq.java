package nf2;

import java.util.Scanner;

public class CadenesVIII_EsquemesTractamentSeq {

    public static void main(String[] args) {
        //Programa que demana una línia de text i un caràcter i diu quantes vegades apareix el caràcter
        //dins del text

        //Cadena de caràcters --> seqüència --> esquema recorregut,
        // per què he de tractar tots els caràcters de la cadena
        //inicialitzarVariables();
        Scanner ent = new Scanner(System.in);
        String linia;
        char c;
        int comptador = 0, index = 0;

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

        do{
            //tractarElement();
            if( c ==  linia.charAt(index)  ){
                comptador++;
            }
            index++;
        //}while(!elementFinal());
        }while ( index < linia.length() );

        //tractamentFinal();
        System.out.format("El caràcter %c apareix %d vegades dins del text %s%n", c, comptador, linia);

    }


}
