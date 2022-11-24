package nf3;

public class Exercici12 {


    public static void main(String[] args) {
        int n = 27;

        int[][] matriu=new int[n][n];

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {

                if(i==j || i+j == matriu.length-1) matriu[i][j] = 1;
                System.out.format("%2d", matriu[i][j]);
                //System.out.format("%2d", matriu[i][j]=valor++);
            }
            System.out.println();
        }

        System.out.println();

        char[][] matriuCaracters=new char[n][n];

        for (int i = 0; i < matriuCaracters.length; i++) {
            for (int j = 0; j < matriuCaracters[i].length; j++) {

                if(i==j || i+j == matriuCaracters.length-1) matriuCaracters[i][j] = 'X';
                else matriuCaracters[i][j] = ' ';
                System.out.format("%2c", matriuCaracters[i][j]);
            }
            System.out.println();
        }


    }
}
