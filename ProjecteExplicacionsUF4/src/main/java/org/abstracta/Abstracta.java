package org.abstracta;

public abstract class Abstracta { //classe abstracta --> és una classe que no es pot instanciar

    public static final int CONSTANT=23;

    private int propietat;

    public int getPropietat() {
        return propietat;
    }

    public void setPropietat(int propietat) {
        this.propietat = propietat;
    }

    //Mètodes abstractes  --> mètode sense implementació, només conté la signatura
    public abstract void metodeAbstracte(int parametre);



}

class Main {

    public static void main(String[] args) {
        int a=Abstracta.CONSTANT;
    }

}

abstract class FillaAbstracta extends Abstracta{

    //Conté un mètode abstracte

}

class FillaNoAbstracta extends Abstracta{

    //Conté un mètode abstracte
    public void metodeAbstracte(int parametre){
        //Implementem el mètode abstracte heredat de la superclasse
        System.out.println("Bon dia");
    }
}
