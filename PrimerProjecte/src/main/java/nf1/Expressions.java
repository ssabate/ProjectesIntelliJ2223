package nf1;

public class Expressions {

    public static void main(String[] args) {

        //Ordre natural d'avaluació de l'expressió
        System.out.println( 3 + 4 * 2 );
        System.out.println( 3 + 8 );
        System.out.println( 11 );

        //Alterem l'ordre natural usant parèntesi
        System.out.println(   (3 + 4) * 2    );
        System.out.println(      7    * 2    );
        System.out.println(   14    );

    }
}
