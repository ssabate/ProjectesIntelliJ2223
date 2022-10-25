package nf1;

public class Boolea {

    public static void main(String[] args) {

        //Declaració de variables
        boolean esHome = true;  // false
        boolean valorBoolea = false;  // false

        //nf1.Expressions booleanes
        //Negació --> canvia el valor del booleà
        System.out.println(!esHome);
        System.out.println(!valorBoolea);

        System.out.println();

        //Y lògica (AND)
        System.out.println(esHome && valorBoolea);
        System.out.println(esHome && !valorBoolea);
        System.out.println(!esHome && valorBoolea);
        System.out.println(!esHome && !valorBoolea);

        System.out.println();

        //O lògica (OR)
        System.out.println(esHome || valorBoolea);
        System.out.println(esHome || !valorBoolea);
        System.out.println(!esHome || valorBoolea);
        System.out.println(!esHome || !valorBoolea);

        System.out.println();
        System.out.println( esHome && valorBoolea || !esHome && valorBoolea);
        System.out.println( esHome && valorBoolea || false && valorBoolea);
        System.out.println( false || false && valorBoolea);
        System.out.println( false || false );
        System.out.println( false );

        //Operacions relacionals
        int a=25, b=4;
        boolean comparacio = a == b ;   // == comparador d'igualtat
        comparacio = a != b ;           // != comparador de diferent
        comparacio = a > b ;            // > comparador major que
        comparacio = a >= b ;            // > comparador major o igual que
        comparacio = a < b ;            // > comparador menor que
        comparacio = a <= b ;            // > comparador menor o igual que

        System.out.println(  a == b || a > b && b != b*4   );
    }
}
