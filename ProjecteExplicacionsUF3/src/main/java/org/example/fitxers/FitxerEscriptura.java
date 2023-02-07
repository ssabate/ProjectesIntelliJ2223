package org.example.fitxers;

import org.example.entitats.Vent;
import java.io.*;

public class FitxerEscriptura {


    public static void main(String[] args) {

        File f=new File("vents.db");
        ObjectOutputStream sort=null;

        //Volem escriure/guardar objctes de la classe Vent al fitxer
        try {
            sort=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));

            Vent v=new Vent("Llevant");

            sort.writeObject(v);
            sort.writeObject(new Vent("Mestral"));

        } catch (IOException e) {
            System.out.println("Atenció, hi ha hagut algun problema a l'escriure les dades!!");
        } finally{
            //Tanquem l'stream de sortida
            try {
                sort.close();
            } catch (IOException e) {
                System.out.println("Atenció, hi ha hagut algun problema al tancar el fitxer!!");
            }catch (NullPointerException e) {

            }

        }


    }
}
