package _03_01_bucles;

import java.util.Scanner;

public class ProducteNaturals {

    public static void main(String[] args) {

/*      Pel problema "NO ÉS PATATA"
        String text;
        if(text.toLowerCase().equals("patata"));
        if(text.toUpperCase().equals("PATATA"));
        if(text.equalsIgnoreCase("pAtAta"));
*/



                //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int numCasos;

        numCasos = ent.nextInt();
        for( ; numCasos >= 1; numCasos--){
            //Tractament de cada cas
            int num = ent.nextInt();
            if( num< 1 ) System.out.println("ELS NOMBRES NATURALS COMENCEN EN 1");
            else{
                int suma=0, producte=1;
                for (int i = 1; i <= num ; i++) {
                    suma+=i;    //suma = suma + i;
                    producte*=i;// producte = producte * i;
                }
                System.out.println("SUMA: "+ suma+" PRODUCTE: "+producte);
            }
        }
    }

}



