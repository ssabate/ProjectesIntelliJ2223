package nf1;

/* Programeu un mètode en Java anomenat subcadena que rebigue els següents paràmetres en l'ordre especificat:
un cadena (String),
un primer número enter,
un segon número enter.


El mètode retornarà una subcadena (un altre String) resultat d'extreure de la cadena els caràcters situats entre el primer
i el segon menys 1 números enters (fixeu-vos que la llargada de la subcadena resultat serà igual al segon menys el primer
número enter). Els casos especials a tractar seran:
 */
public class Exercici7 {

    public static void main(String[] args) {

        System.out.println(subcadena(null, 0, 0));
        System.out.println(subcadena("text", 0, -34));
        System.out.println(subcadena("text", 0, 0));
        System.out.println(subcadena("text", 34, 2));
        System.out.println(subcadena("text", 4, 2));
        System.out.println(subcadena("text", 2, 2));
        System.out.println(subcadena("text", 2, 4));
        System.out.println(subcadena("text", 1, 3));
        System.out.println("");
    }

    public static String subcadena(String cadena, int primer, int segon) {

        if (cadena == null) return null;  // si l'String és null el mètode retornarà null,
        if (primer < 0) primer = 0;        //si el primer número és negatiu se farà el mateix que si valgués 0,
        if (segon <= 0 || primer >= cadena.length()) return "";       //si el segon número és menor o igual que 0 se retornarà la cadena buida,
        //si el primer número és superior o igual a la llargada de l'String, es retornarà la cadena buida,
        if (primer >= segon) return ""; //el mateix farem si el primer número és més gran o igual que el segon,
        if (segon > cadena.length())
            segon = cadena.length(); //si el segon número és superior a la llargada de l'String se farà el mateix que si valgués la llargada.
        String resultat="";

        for (int i = primer; i < segon; i++) {
            resultat += cadena.charAt(i);
        }


        return resultat;
    }
}



