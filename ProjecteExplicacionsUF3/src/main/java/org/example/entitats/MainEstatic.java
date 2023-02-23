package org.example.entitats;

public class MainEstatic {

    public static Vent[] vents=new Vent[100];

    public static void main(String[] args) {
        System.out.println(Vent.GAMMA);

        for (int i = 0; i < 10; i++) {
            Vent v=new Vent("Llevant");
            System.out.println(v.getIdentificador());
            v.identificador=89;

        }
        //System.out.println(v.GAMMA);
    }

}

