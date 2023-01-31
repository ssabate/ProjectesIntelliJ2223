package org.example.entitats;

public class Main {

    public static void main(String[] args) {

        //Instàncio una variable en valors per defecte
        Vent mestral=new Vent();

        //Assigno valors a les propietats
        mestral.nom="Mestral";
        mestral.ratxaMaxima=98.5;
        mestral.calid=true;
        mestral.direccioPrincipal='N';
        mestral.direccioSecundaria='E';
        mestral.diesAny=36;

        //Mostro les propietats
        System.out.println(mestral.nom);
        System.out.println(mestral.ratxaMaxima);
        System.out.println(mestral.calid);
        System.out.println(mestral.direccioPrincipal);
        System.out.println(mestral.direccioSecundaria);
        System.out.println(mestral.diesAny);

    }
}
