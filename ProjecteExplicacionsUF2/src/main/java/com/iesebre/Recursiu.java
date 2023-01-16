package com.iesebre;

public class Recursiu {
    public static void main(String[] args) {
        System.out.println(recursiu(-5));
    }

    /**
     * @param n
     * @return
     */
    public static int recursiu(int n){
        if(n<0) return -1;
        if(n==0) return 0;

        return recursiu(n-1)+n;
    }

}
