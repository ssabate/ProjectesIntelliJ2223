package org.classefinal;

public final class Final {
}

//No es pot estendre (heredar) d'una classe final
//class Filla extends Final{
//
//}

class DeclaraConstant{

    //Propietats, atributs de la classe
    public static final int CONSTANT=9;  //--> CONSTANT

}

class MetodeFinal{

    public void fesAlgo(){
        System.out.println("Bon dia");
    }

    public final void metodeFinal(){
        System.out.println("Estic a un metode final");
    }
}

class FillaMetodeFinal extends MetodeFinal{

    //Sobreescriptura de mètode
    public void fesAlgo(){
        System.out.println("Soc un fill de Metode Final");
    }

    //No es pot sobreeescriure un mètode final
//    public void metodeFinal(){
//
//    }
    public static void main(String[] args) {
        Final f= new Final();
    }

}