package org.example.entitats;

public class Main {

    public static void main(String[] args) {

        //Instàncio una variable en valors per defecte
        Vent mestral=new Vent("mestral");

        //Assigno valors a les propietats
        mestral.setNom("Mestral");
        mestral.setRatxaMaxima(99999999998.5);
        mestral.setCalid(true);
        mestral.setDireccioPrincipal('N');
        mestral.setDireccioSecundaria('E');
        mestral.setDiesAny(36);

        //Mostro les propietats
        System.out.println(mestral.getNom());
        System.out.println(mestral.getRatxaMaxima());
        System.out.println(mestral.isCalid());
        System.out.println(mestral.getDireccioPrincipal());
        System.out.println(mestral.getDireccioSecundaria());
        System.out.println(mestral.getDiesAny());

    }
}
