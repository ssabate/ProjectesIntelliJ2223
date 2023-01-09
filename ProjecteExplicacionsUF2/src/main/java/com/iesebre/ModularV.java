package com.iesebre;

import java.util.Arrays;

public class ModularV {

    public static void main(String[] args) {
        int[] vector={1,2,3,4};
        int[] vector2=new int[0];
        int a=1;
//        paramsVariables();
//        System.out.println();
//        paramsVariables(null);
//        System.out.println();
//        paramsVariables(1);
//        System.out.println();
//        paramsVariables(1,2,3);
//        System.out.println();
//        paramsVariables(new int[]{1,2,3});
//        System.out.println();
//        paramsVariables(vector);
//        System.out.println(Arrays.toString(vector));
//        System.out.println();
//        paramsVariables(a,34);

//        paramsVariables2(1);
//        paramsVariables2(1, null);
//        paramsVariables2(1,2,3,4,5);

        paramsVariables3(1, 2F);
        paramsVariables3(1, 3.4f, null);
        paramsVariables3(1,2.6F,3.5,4.6,5);

    }

    public static void paramsVariables(int... i){
        if(i==null || i.length==0) return;
        //if( i.length==0 || i==null) return;

        int[] copia=new int[i.length];
        for (int j = 0; j < i.length; j++) {
            copia[j]=i[j];
        }

        for (int j = 0; j < i.length; j++) {
            copia[j]=-1;
        }

    }

    public static void paramsVariables2(int num, int... i){
        if(i==null || i.length==0) return;
        //if( i.length==0 || i==null) return;

        int[] copia=new int[i.length];
        for (int j = 0; j < i.length; j++) {
            copia[j]=i[j];
        }

        for (int j = 0; j < i.length; j++) {
            copia[j]=-1;
        }

    }

    public static void paramsVariables3(int num, float x, double... i){
        if(i==null || i.length==0) return;
        //if( i.length==0 || i==null) return;

        double[] copia=new double[i.length];
        for (int j = 0; j < i.length; j++) {
            copia[j]=i[j];
        }

        for (int j = 0; j < i.length; j++) {
            copia[j]=-1;
        }

    }

}
