package org.interficie;

import java.io.Serializable;
import java.util.Scanner;

public interface Interficie {

    //Definició de constants (implícitament totes les propietats són "public static final")
    int RENOM=3;

    //Mètodes abstractes (implícitament tots els mètodes són "public abstract")
    /*
    EL següent mètode l'utilitzarem per blablabla
     */
    void fesAlgo(int param);

    //Mètodes estàtics implementats
    static void fesAlgoEstatic(){
        System.out.println("Estic a un mètode estàtic!!");
    }

    //Mètode per defecte
    default void fesAlgoPerDefecte(){
        System.out.println("Estic a un mètode per defecte!!");
    }
}

class ExempleClasseQueUsaInterficie implements Interficie{


    @Override
    public void fesAlgo(int param) {
        //Implementem el mètode
        //....
    }


    //Podem sobreescriure els mètodes default!!
}
