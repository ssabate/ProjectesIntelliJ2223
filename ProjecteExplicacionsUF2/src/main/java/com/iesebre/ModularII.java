package com.iesebre;

public class ModularII {

    public static void main(String[] args) {

        imprimir("hola");

        String cadena=noImprimir("hola");

        System.out.println(noImprimir("hola"));
    }

    public static void imprimir(String text){
        System.out.println("Has passat el text "+ text);

    }

    public static String noImprimir(String text){
        return "Has passat el text "+ text;
    }
}
