package nf1;

import java.util.Scanner;

import static nf1.Exercici11.buscaCadena;

public class Exercici12 {

    public static void main(String[] args) {

        //Anem a llegir un text format per varies línies i acabat en punt '.'
        //Scanner ent = new Scanner(System.in);
        int index=0,
                compt=0;

        //Demanem el text a l'usuari
        String text = demanarText("Introduix un text acabat en punt ('.'):", '.');

        //Demanar un text a buscar
        String buscat = demanarText("Introduix una subcadena a buscar:", '\n');

        //Anem a buscar la subcadena dins del text
        System.out.println("La subcadena apareix a les posicions:");

        do {
            index = buscaCadena(text, buscat, index);
            if(index!=-1){
                System.out.println(index);
                index=index+1;
                compt++;
            }else break;
        }while(true);

        System.out.format("Total d'aparicions: %d%n", compt);


    }

    public static String demanarText(String missatge, char carBuscat){
        //Anem a llegir un text format per varies línies i acabat en punt '.'
        Scanner ent = new Scanner(System.in);
        String text = "";

        //Demanem el text a l'usuari
        System.out.println(missatge);
        do{
            text += ent.nextLine().trim();
            if( text.endsWith(Character.toString(carBuscat))) break; //sortim del bucle si el text acaba en punt
            else text += "\n";              //afegim salt de línia només si no estem a l'última línia
            //Torno a mirar si el text acaba en el caracter que busquem, per si buscavem el '\n'
            if( text.endsWith(Character.toString(carBuscat))){
                text=text.substring(0,text.length()-1);     //Trec el '\n' final del text
                break;
            }
        }while(true);

        return text;
    }


}
