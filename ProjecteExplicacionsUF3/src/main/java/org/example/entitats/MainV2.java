package org.example.entitats;

public class MainV2 {


    public static void main(String[] args) {

        Vent llevant=new Vent("Llevant",
                96.8,
                true,
                'E',
                ' ',
                35);

        System.out.println(llevant.nom);
        System.out.println(llevant.diesAny);

        System.out.println(llevant.mostrar());


    }
}
