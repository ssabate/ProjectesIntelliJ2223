package nf3;

public class Exercici13 {


    public static void main(String[] args) {
        int n = 27;

        int[][] matriu=new int[n][n];

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {

                if(i==0 || j==0 || i == matriu.length-1 || j == matriu.length-1) matriu[i][j] = 1;
                System.out.format("%2d", matriu[i][j]);
                //System.out.format("%2d", matriu[i][j]=valor++);
            }
            System.out.println();
        }



    }
}
