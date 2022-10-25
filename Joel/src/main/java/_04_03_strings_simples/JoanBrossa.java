package _04_03_strings_simples;

import java.util.Scanner;

public class JoanBrossa {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int numCasos;

        numCasos = ent.nextInt();
        for( ; numCasos >= 1; numCasos--){
            //Tractament de cada cas
            String text;            //text del cas a tractar
            int a, e, i, o, u;      //comptadors de vocals
            a=e=i=o=u=0;            //inicialitzem comptadors a 0
            text= ent.skip("[\r\n]*").nextLine();   //llegim el text a tractar

            //Bucle per recorrer la cadena
            for (int j = 0; j < text.length() ; j++) {
                switch( text.charAt(j)){
                    case 'a':
                        a++;
                        break;
                    case 'e':
                        e++;
                        break;
                    case 'i':
                        i++;
                        break;
                    case 'o':
                        o++;
                        break;
                    case 'u':
                        u++;
                        break;
                }
            }
            //Mostro el resultat del cas actual
            System.out.print("Vocal guanyadora: ");
            if( a>e && a>i && a>o && a>u) System.out.println( "a" );
            else if( e>a && e>i && e>o && e>u) System.out.println( "e" );
            else if( i>a && i>e && i>o && i>u) System.out.println( "i" );
            else if( o>e && o>i && o>a && o>u) System.out.println( "o" );
            else System.out.println( "u" );
        }

    }
}
