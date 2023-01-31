package org.example.entitats;

public class MainV4 {

    public static void main(String[] args) {

        Vent[] vents=new Vent[10];  //Vector de 10 caselles inicialitzades a null
        char[] caracters=new char[10];  //Vector de 10 caselles inicialitzades a 0
        boolean[] respostes=new boolean[10];    //Vector de 10 caselles inicialitzades a false

        for (int i = 0; i < caracters.length; i++) {
            System.out.println(caracters[i]);
        }

        vents[5]=new Vent("Vent de dalt", 150);

        for (int i = 0; i < vents.length; i++) {
            vents[i]=new Vent();
            System.out.println(vents[i].toString());
        }

        vents[0].direccioPrincipal='N';

        for (int i = 0; i < vents.length; i++) {
            System.out.println(vents[i].toString());
        }
    }


}
