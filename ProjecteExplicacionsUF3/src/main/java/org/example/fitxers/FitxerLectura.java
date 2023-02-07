package org.example.fitxers;

import org.example.entitats.Vent;

import java.io.*;

public class FitxerLectura {


    public static void main(String[] args) {

        File f=new File("vents.db");

        if(f.exists()){     //si hem trobat el fitxer passem a llegir-lo

            ObjectInputStream lec=null;

            try {
                try{
                lec=new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));
                }catch(IOException e){
                    System.out.println("Atenció, hi ha hagut algun problema al llegir les dades!!");
                }
                while(true){

                    Vent v=(Vent)lec.readObject();
                    System.out.println(v);
                }


            } catch (IOException ex) {
                System.out.println("Enhorabona, hem pogut llegir totes les dades!!");
            } catch (ClassNotFoundException e) {
                System.out.println("Hi ha hagut un problema en la classe Vent!!");
            }finally{
                try {
                    lec.close();
                } catch (IOException e) {
                    System.out.println("Atenció, hi ha hagut algun problema al tancar el fitxer!!");
                }catch (NullPointerException e) {
                }
            }

        }else System.out.println("No hi ha dades per llegir!!");




    }
}
