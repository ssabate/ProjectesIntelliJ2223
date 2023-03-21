package excepcions;

import java.io.*;

public class ExcepcioIII {

    void metode() throws IOException {

        FileInputStream ent=null;
        try {
            ent = new FileInputStream("pepe.dat");
            int[] vector=new int[0];
            int a=vector[1];
            //Este codi no s'executarà si hi ha una excepció

            System.out.println("dssdmd,f");
        }catch(FileNotFoundException e){

        }finally{
            //Este codi s'executarà tant si hi ha una excepció com si no
            if(ent!=null) ent.close();              //estem obligats a tancar el recurs explícitament

        }
    }

    void metodeTryWithResources(){

        try(FileInputStream ent = new FileInputStream("pepe.dat");){
             int[] vector=new int[0];
             int a=vector[1];
            //Utilitzem l'objecte ent

        }catch(Exception e){

        }finally {
            //ent.close();                      No cal fer-lo per què ho ha automàticament el try-with-resources
            System.out.println("Adeu");
        }
    }



}
