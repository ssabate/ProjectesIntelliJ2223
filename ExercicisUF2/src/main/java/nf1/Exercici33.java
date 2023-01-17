package nf1;

public class Exercici33 {


    public static void main(String[] args) {
        System.out.println(nombreCombinatoriRec(8,2));
    }

    public static int nombreCombinatoriRec(int n, int m){
        //Cas especial
        if(n<m || n<0 || m<0) return -1;

        //Aquí sabem que n>=m
        if(n==m || m==0) return 1;

        return nombreCombinatoriRec(n-1, m-1)+nombreCombinatoriRec(n-1, m);
    }


}
