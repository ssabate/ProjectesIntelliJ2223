package nf2;

import java.util.Scanner;

public class Exercici5 {

    public static void main(String[] args) {

        //Anem a llegir un text format per varies línies i acabat en punt '.'
        Scanner ent = new Scanner(System.in);
        String text = "";

        //Demanem el text a l'usuari
        System.out.println("Introduix un text acabat en punt ('.'):");
        do{
            text += ent.nextLine().trim();
            if( text.endsWith(".") ) break; //sortim del bucle si el text acaba en punt
            else text += "\n";              //afegim salt de línia només si no estem
                                            // a l'última línia
        }while(  true  );
/*
            if( !text.endsWith(".") )
                text += "\n";               //afegim salt de línia només si no estem
                                            // a l'última línia
        }while(  !text.endsWith(".")  );
*/

        //Anem a llegir el text no buit format per una sola línia
        //Demanem el text a l'usuari
        String busquem;
        System.out.println("Introduix un text no buit acabat en INTRO:");
        do {
            busquem = ent.nextLine().trim();
        }while( busquem.isEmpty() );


        //Anem a buscar el segon text dins del primer
        //Vull buscar totes les aparicions d'un caràcter dins d'un text
        int index = 0, comptador = 0;
        do {
            index = text.indexOf(busquem, index);
            //if(index == -1) break;
            if( index != -1 ){
                index++;
                comptador++;
            }
        }while ( index != -1 );

        System.out.format("El text:%n\"%s\"%nconté el text:%n\"%s\"%n%d vegades.%n", text, busquem, comptador);
    }

}
