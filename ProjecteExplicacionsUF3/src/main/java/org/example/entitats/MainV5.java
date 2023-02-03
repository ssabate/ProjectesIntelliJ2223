package org.example.entitats;

import java.util.Arrays;

public class MainV5 {

    public static void main(String[] args) {

        Vent[] vents=new Vent[4];

        //L'usuari diu els valors del nou vent
        Vent nou=new Vent("cerç");

        int i=0;
        for (; i < vents.length &&
                vents[i]!=null &&
                vents[i].getNom().compareToIgnoreCase(nou.getNom())<0; i++);        // busquem la primera casella buida o
                                                                                    // major que el nou vent
        if(i==vents.length) System.out.println("Ho sento, no podem afegir més vents!!");
        else {
            //Primer hem de moure tots els vents una casella cap a la dreta
            int j=vents.length-1;
            for (; j < vents.length && i<j; j--)
                vents[j]=vents[j-1];
            vents[i]=nou;
        }

        //Mostrem contingut del vector
        System.out.println(Arrays.toString(vents));

        //L'usuari diu els valors del nou vent
        nou=new Vent("vent de dalt");

        i=0;
        for (; i < vents.length &&
                vents[i]!=null &&
                vents[i].getNom().compareToIgnoreCase(nou.getNom())<0; i++);        // busquem la primera casella buida o
        // major que el nou vent
        if(i==vents.length) System.out.println("Ho sento, no podem afegir més vents!!");
        else {
            //Primer hem de moure tots els vents una casella cap a la dreta
            int j=vents.length-1;
            for (; j < vents.length && i<j; j--)
                vents[j]=vents[j-1];
            vents[i]=nou;
        }

        //Mostrem contingut del vector
        System.out.println(Arrays.toString(vents));

        //L'usuari diu els valors del nou vent
        nou=new Vent("aliseos");

        i=0;
        for (; i < vents.length &&
                vents[i]!=null &&
                vents[i].getNom().compareToIgnoreCase(nou.getNom())<0; i++);        // busquem la primera casella buida o
        // major que el nou vent
        if(i==vents.length) System.out.println("Ho sento, no podem afegir més vents!!");
        else {
            //Primer hem de moure tots els vents una casella cap a la dreta
            int j=vents.length-1;
            for (; j < vents.length && i<j; j--)
                vents[j]=vents[j-1];
            vents[i]=nou;
        }

        //Mostrem contingut del vector
        System.out.println(Arrays.toString(vents));


    }

}
