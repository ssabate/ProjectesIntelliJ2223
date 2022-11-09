package nf2;

import java.util.Scanner;

public class Exercici14 {

    public static void main(String[] args) {

        //Anem a llegir un text format per varies línies i acabat en una
        // línia que conté el punt '.'
        Scanner ent = new Scanner(System.in);
        String text = "", resultat = "";
        int num;

        //Demanem un número positiu a l'usuari
        do{
            System.out.println("Introduix un enter (>0):");
            num = ent.nextInt();
            if( num <= 0) System.out.println("Ha de ser major que 0!!");
            else break;
        }while( true );

        //ent.nextLine();         //lectura extra per solucionar el problema del buffer de l'scanner

        //Demanem el text a l'usuari
        System.out.println("Introduix un text acabat en una línia que conté el punt ('.'):");
        do{
            String linia = ent.skip("[\r\n]*").nextLine().trim();
            if( linia.length() < num)
                resultat += linia;
            else
                resultat += linia.substring(0,num);

            text += linia;
            if( text.contains(".") ) break; //sortim del bucle si el text conté el punt
            else {
                text += "\n";              //afegim salt de línia només si no estem
                resultat += " ";           // a l'última línia
            }
        }while(  true  );

//        System.out.format("El text:%n\"%s\"%nconté el text:%n\"%s\"%n%d vegades.%n", text, busquem, comptador);
        System.out.format("El text resultat és%n\"%s\"%n", resultat);
    }

}
