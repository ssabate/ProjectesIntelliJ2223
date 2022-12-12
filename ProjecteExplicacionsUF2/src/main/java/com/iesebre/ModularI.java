package com.iesebre;

import java.util.Scanner;

public class ModularI {

    public static void main(String[] args) {
        //Declaració de variables del main
        Scanner ent = new Scanner(System.in);
        double amp, alt, area;

        System.out.println("Introduix amplada i altura del rectangle");
        amp= ent.nextDouble();
        alt=ent.nextDouble();

        System.out.println("L'àrea del rectangle és " + areaRectangle(amp, alt));

        System.out.println("El caracter elegit és"+ caracterA("12345", 3));
    }


    //Implementació del mètode areaRectangle
    public static double areaRectangle(double amplada, double altura){
        return amplada*altura;

    }

    public static int metodeCompostPerVariesParaules (int a, int b, char c){
        //Declaració de variables del mètode
        int g;
        if(a==50) return b;
        //Codi del mètode
        System.out.println("Hello world!");

        return a*b;
//        System.out.println();
    }

    public static char caracterA(String text, int index){
        return text.charAt(index-1);

    }






}