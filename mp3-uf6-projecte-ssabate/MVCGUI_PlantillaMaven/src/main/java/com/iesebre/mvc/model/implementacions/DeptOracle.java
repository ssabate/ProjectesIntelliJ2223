package com.iesebre.mvc.model.implementacions;

import com.iesebre.mvc.model.daos.DAO;
import com.iesebre.mvc.model.excepcions.ExcepcioDAO;
import com.iesebre.mvc.model.pojos.Departament;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

public class DeptOracle implements DAO<Departament> {
    @Override
    public Collection<Departament> getAll()  throws ExcepcioDAO{
        //Col·lecció on guardarem les dades recuperades
        ArrayList<Departament> resultat=new ArrayList<>();

        //Connexió en la base de dades Oracle
        try(
                Connection con= DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","c##hr","12345");
                Statement sent=con.createStatement();
                ResultSet rs= sent.executeQuery("SELECT department_id, department_name FROM departments");
                )
        {
            //Recorrem el result set
            while(rs.next()){

                resultat.add(new Departament(
                        rs.getLong(1),
                        rs.getString("department_name") //nom de la columna del select, no és el nom del pojo
                ));


            }
        } catch (SQLException e) {
            throw new ExcepcioDAO(1);
        }


        return resultat;
    }

    @Override
    public Departament get(long id)  throws ExcepcioDAO{
        return null;
    }

    @Override
    public boolean save(Departament objecte)  throws ExcepcioDAO{
        return false;
    }

    @Override
    public boolean delete(Departament objecte)  throws ExcepcioDAO{
        return false;
    }

    @Override
    public boolean update(Departament objecte)  throws ExcepcioDAO{
        return false;
    }
}
