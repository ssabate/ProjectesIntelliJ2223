package nf2;

import java.util.Scanner;

public class CadenesV {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        //Lectura d'un sol caràcter em l'Scanner
        System.out.println("Introduix un caràcter:");
        char c=ent.nextLine().charAt(0);

        System.out.format("Has introduit una %c%n", c);

        System.out.println("Introduix un caràcter:");
        String resposta=ent.nextLine();
        if(resposta.length()!=0) c = resposta.charAt(0);
        else c = ' ';

        System.out.println("Has introduit una "+c);

    }

}
