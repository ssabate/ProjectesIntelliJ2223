package _04_03_strings_simples;

import java.util.Scanner;

public class NumerosBinaris {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();


        for (int i = 0; i < numCasos; i++) {

            //Llegim l'expressió
            short a, b, resultat = 0;
            char op;

            //Lectura dels valors
            a = Short.parseShort(ent.skip("[\r\n]*").next());
            op = ent.skip("[\r\n]*").next().charAt(0);
            b = Short.parseShort(ent.skip("[\r\n]*").next());

            //Càlcul de l'operació a op b
            switch(op){
                case '+':
                    resultat = (short) (a + b);
                    break;
                case '-':
                    resultat = (short) (a - b);
                    break;
            }

            //Anem a calcular el número binari corresponent el resultat
            String binari = "";

            do{
                //binari += resultat %2; --> incorrecta per què afegix per la dreta
                binari = ( resultat % 2 ) + binari; //correcte --> afegix per l'esquerra
                resultat /= 2;
                //System.out.println( binari );
            }while( resultat!= 0 );
            System.out.println( binari );

        }


    }
}
