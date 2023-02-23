package org.example.entitats;

import java.io.Serializable;

public class Vent implements Serializable {



    //Prpopietats estàtiques
    public static final double GAMMA=5.56;
    private static int serialNumber=0;

    //Propietats de la classe --> definixen l'estat dels objectes
    public int identificador;
    private String nom;
    private double ratxaMaxima;
    private boolean calid;
    private char direccioPrincipal;
    private char direccioSecundaria;
    private int diesAny;

    //Mètodes --> definixen el comportament dels objectes

    //1r tipo. Mètode(s) constructor(s)
    private Vent(){                 //constructor buit, per què no té paràmetres
        this.identificador=serialNumber;
        serialNumber=serialNumber+1;
        nom="Sirocco";
        direccioPrincipal='S';
        direccioSecundaria=' ';
        calid=true;
    }

    public Vent(String nom){
        this();                     //crido al constructor buit de la classe
        this.nom=nom;
    }

    public Vent(String nom, int diesAny){
        this();
        this.nom=nom;
        this.diesAny=diesAny;
    }

    public Vent(String nom,
                double ratxaMaxima,
                boolean calid,
                char direccioPrincipal,
                char direccioSecundaria,
                int diesAny){
        this();
        this.nom=nom;
        this.ratxaMaxima=ratxaMaxima;
        this.calid=calid;
        this.direccioPrincipal=direccioPrincipal;
        this.direccioSecundaria=direccioSecundaria;
        this.diesAny=diesAny;
    }

    //2n tipo. Mètodes d'utilitat

    @Override
//    public String toString() {
//        return "Vent{" +
//                "nom='" + nom + '\'' +
//                ", ratxaMaxima=" + ratxaMaxima +
//                ", calid=" + (calid?"calid":"gelat") +
//                ", direccioPrincipal=" + direccioPrincipal +
//                ", direccioSecundaria=" + (direccioSecundaria==' '?'X':direccioSecundaria) +
//                ", diesAny=" + diesAny +
//                '}';
//    }


    public String toString() {
        return "Vent{" +
                "nom='" + nom + '\'' +
                '}';
    }

    public String mostrar(){
        return nom+", "+ratxaMaxima+", "+calid+", "+direccioPrincipal+", "+direccioSecundaria+", "+diesAny;

    }

    //3r tipo --> mètodes accessors, getters i setters

    public static int getSerialNumber() {
        return serialNumber;
    }

    private static void setSerialNumber(int serialNumber) {
        Vent.serialNumber = serialNumber;
    }

    public int getIdentificador() {
        return identificador;
    }

    private void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getRatxaMaxima() {
        return ratxaMaxima;
    }

    public void setRatxaMaxima(double ratxaMaxima) {
        if(ratxaMaxima<0 || ratxaMaxima>300) return;
        this.ratxaMaxima = ratxaMaxima;
    }

    public boolean isCalid() {
        return calid;
    }

    public void setCalid(boolean calid) {
        this.calid = calid;
    }

    public char getDireccioPrincipal() {
        return direccioPrincipal;
    }

    public void setDireccioPrincipal(char direccioPrincipal) {
        if(direccioPrincipal!='N' && direccioPrincipal!='S' && direccioPrincipal!='E' && direccioPrincipal!='O' ) return;
        this.direccioPrincipal = direccioPrincipal;
    }

    public char getDireccioSecundaria() {
        return direccioSecundaria;
    }

    public void setDireccioSecundaria(char direccioSecundaria) {
        this.direccioSecundaria = direccioSecundaria;
    }

    public int getDiesAny() {
        return diesAny;
    }

    public void setDiesAny(int diesAny) {
        this.diesAny = diesAny;
    }


    public static void main(String[] args) {
        serialNumber++;
        Vent v=new Vent();
        v.identificador=34;
    }
}
