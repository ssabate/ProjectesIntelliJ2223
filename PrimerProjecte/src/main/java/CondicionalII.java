import java.util.Scanner;

public class Condicional {

    public static void main(String[] args) {
        //Estructura condicional --> si l'expressió boolean és true
        //                          executem el codi de dins les claus
        //                          i si és false sontinuem l'execució
        //                          a continuació de }
        //if( expressió booleana){
        //    codi de l'if....
        //}
        //codi continuació

        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int a, b;

        //1. Demanem valors a l'usuari
        System.out.println("Introduix 2 números enters:");
        a = ent.nextInt();
        b = ent.nextInt();

        //2. Escrivim "Són divisibles" si els 2 números ho són
        // i sinó no escrivim res
        if( a % b == 0 ){
            System.out.println("Son divisibles");
        }


    }


}
