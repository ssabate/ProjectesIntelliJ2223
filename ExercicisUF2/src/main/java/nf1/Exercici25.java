package nf1;

public class Exercici25 {

    public static void main(String[] args) {
        System.out.println(longitudNumero(1234));
        System.out.println(longitudNumero(016654));
        System.out.println(longitudNumero(-1234));
    }

    public static int longitudNumero(int n){
        return Integer.toString(n).length() - ( n<0 ? 1 : 0);

    }


}
