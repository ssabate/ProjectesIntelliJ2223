package persistence.exceptions;

import java.util.HashMap;
import java.util.Map;

public class DAOException extends Exception{

    private static Map<Integer, String> mis=new HashMap<Integer,String>();

    static{
        mis.put(0,"Error indeterminat!!");
        mis.put(1,"Error al borrar/actualitzar a la base de dades!!");
        mis.put(2,"Error al tancar la base de dades!!");
        mis.put(3,"Error al guardar canvis a la base de dades!!");
        mis.put(4,"Error al llegir de la base de dades!!");
        mis.put(5,"Error al connectar a la base de dades");
    }

    private Integer tipo;

    public DAOException() {
        this.tipo = 0;
    }
    public DAOException(Integer tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getMessage() {
        return this.mis.get(tipo);
    }
}
