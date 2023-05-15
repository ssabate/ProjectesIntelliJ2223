package com.iesebre.mvc.model.excepcions;

import java.util.HashMap;
import java.util.Map;

public class ExcepcioDAO extends Exception{

    private static Map< Integer, String > missatges=new HashMap<>();

    static{
        missatges.put(1, "Error al connectar a la BD!!");
        //més missatges a mostrar

    }

    private int tipo;

    public ExcepcioDAO(int tipo){
        this.tipo=tipo;
    }

    @Override
    public String getMessage() {
        return missatges.get(this.tipo);
    }
}
