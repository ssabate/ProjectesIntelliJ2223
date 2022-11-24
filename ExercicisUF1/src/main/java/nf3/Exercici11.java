package nf3;

public class Exercici11 {


    public static void main(String[] args) {
        int n = 27, valor=1;

        int[][] matriu=new int[n][n];

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {

                matriu[i][j] = valor;
                valor++;
                System.out.format("%5d", matriu[i][j]);
                //System.out.format("%5d", matriu[i][j]=valor++);
            }
            System.out.println();
        }


    }
}
