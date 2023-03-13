package org.enumeracio;

import java.io.Serializable;
import java.util.Arrays;

public enum Enumeracio {

    NORD(), SUD(), EST(), OEST()


}


enum Complexa{

    N(1), S(2), E(3), O(4);

    //Propietats
    private final int ordre;

    //Mètodes
    private Complexa(int ordre){
        this.ordre=ordre;

    }

    public int mostrarOrdre(){
        return this.ordre;
    }




}

class Main{



    public static void main(String[] args) {

        Pojo p =new Pojo(Enumeracio.OEST);
        Enumeracio variable=Enumeracio.EST;
        p.puntCardinal=Enumeracio.NORD;

        p.setPuntCardinal(Enumeracio.SUD);


        Complexa c=Complexa.S;
        //Complexa c1=new Complexa(34);

        System.out.println(c.mostrarOrdre());
        System.out.println(Complexa.O.mostrarOrdre());


        System.out.println(Arrays.toString(Complexa.values()));

        for (int i = 0; i < Complexa.values().length; i++) {
            System.out.println(Complexa.values()[i]);
        }

        for (Complexa comp:Complexa.values()) {
            System.out.println(comp);
            System.out.println(comp.mostrarOrdre());
        }

        Complexa puntC=Complexa.valueOf("N");


    }


}

class Pojo{
    public Pojo(Enumeracio e){
        this.puntCardinal=e;
    }

    //public Pojo(){}


    Enumeracio puntCardinal;

    public Enumeracio getPuntCardinal() {
        return puntCardinal;
    }

    public void setPuntCardinal(Enumeracio puntCardinal) {
        this.puntCardinal = puntCardinal;
    }
}
