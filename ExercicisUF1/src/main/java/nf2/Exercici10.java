package nf2;

import java.util.Scanner;

public class Exercici10 {

    public static void main(String[] args) {
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

        //Eliminem els separadors del text
        String noEspai="", separadors=" ,'.\n:;-";
        for (int i = 0; i < text.length(); i++) {
            char c=text.charAt(i);

            //if( c != ' ' && c!=',' && c!='\'' && c!='.' && c!='\n')
            if(!separadors.contains(Character.toString(c))) //c+""
                noEspai = noEspai + c;
        }
        //Copiem el text original sense espais i convertit a minúscules
        text=noEspai.toLowerCase();


        int i;
        for(i=0; i <= text.length()/2 - 1; i++){
            char j=text.charAt(text.length()-1-i);
           if (text.charAt(i)!=j) break;
        }
        if( i > text.length()/2 - 1 )
            System.out.println("És palíndrom!!");
        else
            System.out.println("No és palíndrom!!");
    }
}
