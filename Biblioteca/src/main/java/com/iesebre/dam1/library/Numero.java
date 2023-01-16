package com.iesebre.dam1.library;

public class Numero {

    /**
     * Calcula el terme n-èssim de la successió de Fibonacci, si n>=0.
     * Si n &#60; 0 retorna -1.
     * @param n el terme que volem calcular
     * @return el terme n-èssim de la successió de Fibonacci
     */
    public static int fibonacci(int n){

        if(n<0) return -1;
        if(n==0) return 0;
        if(n==1) return 1;

        //Aquí sabem que la n>1
        return fibonacci(n-1)+fibonacci(n-2);
    }

    /**
     * Calcula el màxim comú divisor de 2 números enters positius. Si hi ha algun negatiu retornem -1
     * @param a el primer dels números dels quals volem calcular l'mcd
     * @param b el segon dels números dels quals volem calcular l'mcd
     * @return El màxim comú divisor d'a i b
     */
    public static int mcdRecursiu(int a, int b){
        if(a<0 || b<0) return -1;
        if(a==b) return a;
        if(a<b) return mcdRecursiu(a, b-a);
        return mcdRecursiu(a-b,b);
    }

}
