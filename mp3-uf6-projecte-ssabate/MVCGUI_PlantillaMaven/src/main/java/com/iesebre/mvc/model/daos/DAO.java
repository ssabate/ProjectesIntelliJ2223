package com.iesebre.mvc.model.daos;

import com.iesebre.mvc.model.excepcions.ExcepcioDAO;

import java.util.Collection;

public interface DAO <T>{

    //Recupera totes les dades d'una taula de la base de dades (de la classe T) i les guarda a una col·lecció
    Collection<T> getAll() throws ExcepcioDAO;

    //Recupera la dada identificada pel paràmetre d'una taula de la base de dades (de la classe T) i la retorna
    T get(long id) throws ExcepcioDAO;

    //Guardar l'objecte que rep com a paràmetre a la taula de la base de dades. Retorna true si ha pogut i false en cas contrari
    boolean save(T objecte) throws ExcepcioDAO;

    boolean delete(T objecte) throws ExcepcioDAO;

    boolean update(T objecte) throws ExcepcioDAO;

}
