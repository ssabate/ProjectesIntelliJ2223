package excepcions;

import java.io.*;

public class ExcepcioII {


    public void metodeLlancador() throws FileNotFoundException, IOException {

            //ObjectInputStream ent = new ObjectInputStream(new BufferedInputStream(new FileInputStream("pepe.dat")));
        throw new FileNotFoundException();
    }


    public void metode2() throws IOException {
        metodeLlancador();

    }

    public void metode3() throws IOException {
        metode2();

    }

    public static void main(String[] args) {

        ExcepcioII obj=new ExcepcioII();
        try {
            obj.metode3();
        }catch(Exception e){
            System.out.println("Error");
        }
    }



}
