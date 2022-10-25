package _02_05_alternatives_modul_hores;

import java.util.Scanner;

public class HoraValida {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int h, m, s;

        //Entrada --> lectura de dades
        h = ent.nextInt();
        m = ent.nextInt();
        s = ent.nextInt();

        //Mostrem el resultat
        //Són correctes:
        // h està entre 0 i 23?
        // m està entre 0 i 59?
        // s està entre 0 i 59?
        if( h>=0 && h<=23 &&
        m>=0 && m<=59 &&
        s>=0 && s<=59 ){
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

    }
}
