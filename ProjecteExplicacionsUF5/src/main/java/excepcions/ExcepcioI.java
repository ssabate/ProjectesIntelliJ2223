package excepcions;

import java.io.*;

public class ExcepcioI {


    public static void main(String[] args) {

        int[] vector=new int[10];

        try {
            int valor = vector[34];
        }catch(ArrayIndexOutOfBoundsException e){

            System.out.println(e.getMessage());
        }

        try {
            ObjectInputStream ent = new ObjectInputStream(new BufferedInputStream(new FileInputStream("pepe.dat")));
        }catch(FileNotFoundException e){
            System.out.println("No s'ha trobat el fitxer");
        }catch(IOException e){

            System.out.println("Hi ha hagut un error a l'stream de lectura");
        }catch(Exception e){

            System.out.println("Hi ha hagut un error desconegut!!");
        }



    }





}
