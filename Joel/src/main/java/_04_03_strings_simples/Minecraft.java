package _04_03_strings_simples;

import java.util.Scanner;

public class Minecraft {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        for( ; numCasos >= 1; numCasos--){
            int numPas = ent.nextInt();
            int comptDiamants = 0;
            for( ; numPas >= 1; numPas--){
                //Tractament de cada passadís
                String passadis = ent.skip("[\r\n]*").nextLine();

                int index = 0;
                do {
                    index = passadis.indexOf("{}", index);
                    //if(index == -1) break;
                    if( index != -1 ){
                        index++;
                        comptDiamants++;
                    }
                }while ( index != -1 );

            }

            System.out.println(comptDiamants);
        }

    }

}
