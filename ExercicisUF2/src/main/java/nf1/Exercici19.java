package nf1;

import java.util.Random;

public class Exercici19 {

    public static void main(String[] args) {
        System.out.println(reemplassaCaracters("ABCDEF", 'C', 'c'));
        System.out.println(reemplassaCaracters("", 'C', 'c'));
        System.out.println(reemplassaCaracters(null, 'C', 'c'));
        System.out.println(reemplassaCaracters("ABCDEF", 'X', 2));

    }

    public static String reemplassaCaracters(String cadena, char esta, char canvi){
        //Casos especials
        if(cadena==null || cadena.length()==0) return cadena;

        String resultat="";
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i)==esta) resultat+=canvi;
            else resultat+=cadena.charAt(i);
        }

        return resultat;
    }

    public static String reemplassaCaracters(String cadena, char canvi, int vegades){
        //Casos especials
        if(cadena==null || cadena.length()==0|| vegades<=0) return cadena;

        Random r=new Random();
        for (int i = 0; i < vegades; i++) {
            int posicio=r.nextInt(cadena.length());  //genera un número aleatori entre o i cadena.length()-1

            cadena = cadena.substring(0,posicio)+canvi+cadena.substring(posicio+1);
        }

        return cadena;
    }


}
