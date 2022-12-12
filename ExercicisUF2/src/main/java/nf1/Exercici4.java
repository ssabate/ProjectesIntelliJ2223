package nf1;

public class Exercici4 {

    public static void main(String[] args) {
        //insertaCadena("12345");
        //insertaCadena("");
        System.out.println(insertaCadena("12345", "Text", 0));

    }

    public static String insertaCadena(String primerText, String segonText, int pos){
        //tractament dels casos especials --> s'ha de fer primer de tot!!
        if(primerText==null && segonText==null) return null;
        //Aquí sabem que els 2 strings no són null
        if(primerText==null) return segonText;
        if(segonText==null) return primerText;
        //Aquí sabem que cap string és null
        if(pos<0) pos=0;
        if(pos>primerText.length()) pos=primerText.length();

        String resultat="";

        //Obtenció del primer tros del primerText (fins pos)
        for (int i = 0; i < pos; i++) {
            resultat += primerText.charAt(i);
        }

        resultat+=segonText;

        for (int i = pos; i < primerText.length(); i++) {
            resultat += primerText.charAt(i);
        }

        //return primerText.substring(0, pos) + segonText + primerText.substring(pos);
        return resultat;


    }

}
