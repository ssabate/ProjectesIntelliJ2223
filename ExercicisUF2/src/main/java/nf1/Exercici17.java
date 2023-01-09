package nf1;

import java.util.Arrays;

public class Exercici17 {

    public static void main(String[] args) {
        tractaParametres();
        tractaParametres(null);
        tractaParametres(new int[0]);
        System.out.println(Arrays.toString(tractaParametres(1,2,3,4,5)));

        int[] vector=tractaParametres(1,2,3,4,5);
        System.out.println(Arrays.toString(vector));
    }

    public static int[] tractaParametres(int... params){
        //Tractament de casos especials
        //Cas que no ens passen cap paràmetre,
        // o rebem un null, o rebem un vector de 0 caselles, retornarem null
        if(params==null || params.length==0) return null;

        int suma=0, max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        for (int i = 0; i < params.length; i++) {
            suma += params[i];
            if(params[i]>max) max=params[i];
            if(params[i]<min) min=params[i];
        }
        return new int[]{suma, params.length, max, min};
    }
}
