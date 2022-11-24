package nf3;

import java.util.Random;

public class VectorsIV {

    public static void main(String[] args) {
        Random r = new Random();
        int[] vectorUnidimensional= new int[10];

        int[][] vectorBidimensional= new int[5][7];

        for (int i = 0; i < vectorBidimensional.length; i++) {
            for (int j = 0; j < vectorBidimensional[i].length; j++) {
                System.out.format("%5d", vectorBidimensional[i][j]);
            }
            System.out.println();
        }

        char[][][] cub= new char[2][3][4];

        for (int i = 0; i < cub.length; i++) {
            for (int j = 0; j < cub[i].length; j++) {
                for (int k = 0; k < cub[i][j].length; k++) {
                    cub[i][j][k] = (char)(r.nextInt('C' - 'A' + 1) + 'A');
                    System.out.format("%2c", cub[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }

        //Declaració de vectors de més d'una dimensió
        double[][] respostes= new double[4][];

        respostes[0]=new double[5];
        respostes[1]=new double[2];
        respostes[2]=new double[]{23.65, Math.PI, Math.E};
        respostes[3]=new double[0];

        for (int i = 0; i < respostes.length; i++) {
            for (int j = 0; j < respostes[i].length; j++) {
                System.out.format("%5.2f", respostes[i][j]);
            }
            System.out.println();
        }



    }



}
