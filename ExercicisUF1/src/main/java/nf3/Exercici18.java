package org.example;

import java.util.Scanner;

public class Exercici18 {

    public static void main(String[] args) {
        Scanner ent=new Scanner(System.in);

        int n=ent.nextInt();
        int[][] magica=new int[n][n];
        int valor=1, i=0, j= n/2, copiaI=i, copiaJ=j;

        while(valor <= n * n){
            if(magica[i][j]!=0){    //Hem trobat una casella que ja conté un valor correcte
                i=copiaI+1;
                j=copiaJ;
            }
            magica[i][j]=valor++;

            //Copiem les posicions i,j de la darrera casella omplida
            copiaI=i;
            copiaJ=j;

            //Preparem i, j per col·locar el següent valor
            i--;
            j--;
            if(i<0) i = magica.length-1;
            if(j<0) j = magica.length-1;
        }

        //Mostrem el quadrat màgic
        for (int k = 0; k < magica.length; k++) {
            for (int l = 0; l < magica[k].length; l++) {
                System.out.format("%5d", magica[k][l]);
            }
            System.out.println();
        }


    }


}
