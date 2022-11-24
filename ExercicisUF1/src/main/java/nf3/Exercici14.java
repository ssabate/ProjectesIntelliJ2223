package nf3;

public class Exercici14 {


    public static void main(String[] args) {
        int n = 7;
        char lletra = 'A';

        char[][] matriuCaracters=new char[n][n];

        for (int i = 0; i < matriuCaracters.length; i++) {
            for (int j = 0; j < matriuCaracters[i].length; j++) {
                matriuCaracters[i][j] = lletra;

                if(lletra=='Z') lletra='A';
                else lletra++;

                System.out.format("%2c", matriuCaracters[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        int increment=0;
        for (int i = 0; i < matriuCaracters.length; i++) {
            for (int j = 0; j < matriuCaracters[i].length; j++) {
                matriuCaracters[i][j] = (char)('A' +   (increment++) % ('Z'-'A'+ 1)    );
                System.out.format("%2c", matriuCaracters[i][j]);
            }
            System.out.println();
        }


    }
}
