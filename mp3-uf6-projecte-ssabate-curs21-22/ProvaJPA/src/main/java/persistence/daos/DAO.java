package persistence.daos;


import persistence.exceptions.DAOException;

import java.util.List;

public interface DAO <T>{

    T get(Long id) throws DAOException;

    List<T> getAll() throws DAOException;

    void save(T obj) throws DAOException;

    //Tots els mètodes necessaris per interactuar en la BD
    List<T> getFromQuery(String query) throws DAOException;    //Obtenim dades a partir d'una consulta SELECT

    void setFromQuery(String update) throws DAOException;       //Actualitzem/borrem dades a partir d'un UPDATE/DELETE...

    void close() throws DAOException;
}
