package nf2;

public class CadenesIII {

    public static void main(String[] args) {
        //recorregut d'un String --> for, length(), charAt()
        String cadena = "Anem a recorrer esta cadena...";

        System.out.println("La longitud de la cadena es "+cadena.length());
        //Bucle per recorrer la cadena
        int comptador = 0;
        for (int i = 0; i < cadena.length() ; i++) {
            //System.out.println(i);
            //System.out.format("El caracter %d-èssim de la cadena és %c %n", i, cadena.charAt(i));

            if( cadena.charAt(i) == 'a') comptador++;
        }
        System.out.format("%nLa cadena \"%s\" conté %d 'a's", cadena, comptador);
    }
}
