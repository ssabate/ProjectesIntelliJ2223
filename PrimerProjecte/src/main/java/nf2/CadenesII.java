package nf2;

public class CadenesII {
    public static void main(String[] args) {

        //Altres mètodes interessants de la classe String
        System.out.println("La meua longitud és ".length() );   //length --> longitud de la cadena

        char caracter = "abcde".charAt( 0 );
        caracter = "abcde".charAt( 1   );
        caracter = "abcde".charAt( 2   );
        caracter = "abcde".charAt( "abcde".length()-2   );
        caracter = "abcde".charAt( "abcde".length()-1  );
        caracter = "abcde".charAt( "abcde".length()   );
        System.out.format(" %c ", caracter );
        System.out.format(" %c ", 'r' );



    }
}
