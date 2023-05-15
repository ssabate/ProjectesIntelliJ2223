package codifont;

import persistence.entities.Pojo;
import persistence.exceptions.DAOException;
import persistence.implementations.DAOEclipseLinkMySQLImpl;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        try {
            DAOEclipseLinkMySQLImpl dao=new DAOEclipseLinkMySQLImpl("MY-PU");
            dao.save(new Pojo(1 ,2));

            for (Pojo p: dao.getAll()) {
                System.out.println(p);
            }
            dao.close();
        } catch (DAOException e) {
            JOptionPane.showMessageDialog(null,"Houston, tenemos un problema...");
        }

    }
}
