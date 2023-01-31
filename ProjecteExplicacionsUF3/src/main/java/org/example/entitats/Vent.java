package org.example.entitats;

public class Vent {

    //Propietats de la classe
    String nom;
    double ratxaMaxima;
    boolean calid;
    char direccioPrincipal;
    char direccioSecundaria;
    int diesAny;

    //Mètodes

    //1r tipo. Mètode(s) constructor(s)
    public Vent(){
        nom="Sirocco";
        direccioPrincipal='S';
        direccioSecundaria=' ';
        calid=true;
    }

    public Vent(String nom){
        this.nom=nom;
    }

    public Vent(String nom, int diesAny){
        this.nom=nom;
        this.diesAny=diesAny;
    }

    public Vent(String nom,
                double ratxaMaxima,
                boolean calid,
                char direccioPrincipal,
                char direccioSecundaria,
                int diesAny){
        this.nom=nom;
        this.ratxaMaxima=ratxaMaxima;
        this.calid=calid;
        this.direccioPrincipal=direccioPrincipal;
        this.direccioSecundaria=direccioSecundaria;
        this.diesAny=diesAny;
    }

    //2n tipo. Mètodes d'utilitat

    @Override
    public String toString() {
        return "Vent{" +
                "nom='" + nom + '\'' +
                ", ratxaMaxima=" + ratxaMaxima +
                ", calid=" + (calid?"calid":"gelat") +
                ", direccioPrincipal=" + direccioPrincipal +
                ", direccioSecundaria=" + (direccioSecundaria==' '?'X':direccioSecundaria) +
                ", diesAny=" + diesAny +
                '}';
    }

    public String mostrar(){
        return nom+", "+ratxaMaxima+", "+calid+", "+direccioPrincipal+", "+direccioSecundaria+", "+diesAny;

    }
}
