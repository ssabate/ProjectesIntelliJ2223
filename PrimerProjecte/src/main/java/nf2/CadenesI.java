package nf2;

public class CadenesI {
    public static void main(String[] args) {
        //Declaració de variables
        System.out.println("Hola bon dia".toUpperCase());

        String cadena = "Hola bon dia"+", avui és dimarts";

        String cadena2=cadena.toUpperCase();
        int i;
        i = 9;

        //Instanciació de cadenes
        String cadena3 = new String("Hola");

        String cadena4 = new String("Hola");

        String cadena5 = "Hola";
        String cadena6 = "Hola";

        //Comparar cadenes (i qualsevol objecte). No usar mai == !!
        if(cadena5.equals(cadena6)) System.out.println("Iguals");
        else System.out.println("Diferents");

    }
}
