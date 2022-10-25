package nf1;

public class Formatejar {

    public static void main(String[] args) {
        System.out.println("El valor " + Math.PI + " és de la constant PI");
        System.out.println();

        System.out.println("Codis de format simples:");
        System.out.format("El valor %f és de la constant PI", Math.PI );
        System.out.println();
        System.out.format("El valor %e és de la constant PI", Math.PI );
        System.out.println();
        System.out.format("El valor %E és de la constant PI", Math.PI );
        System.out.println();
        System.out.format("El valor %g és de la constant PI", Math.PI );
        System.out.println();
        System.out.format("El valor %G és de la constant PI", Math.PI );
        System.out.println();
        System.out.println();
        System.out.println("Codis de format més complexos:");
        System.out.format("El valor %15.2f és de la constant PI", Math.PI );
        System.out.format("El valor %015.2f és de la constant PI", Math.PI );
        System.out.format("El valor %+015.2f és de la constant PI", Math.PI );
        System.out.format("El valor %015.2f és de la constant PI", Math.PI );

        System.out.println("Mostrem el mateix valor en diferents formats:");
        System.out.format("PI = %015.2f  PI = %.4f", Math.PI, Math.PI );
        System.out.println();
        System.out.format("PI = %015.2f  E = %.4f", Math.PI, Math.E );
        System.out.println();
        System.out.format("PI = %015.2f - E = %.4f - Enter més gran de Java = %d", Math.PI, Math.E, Integer.MAX_VALUE );

        System.out.println();
        System.out.println("Mostrem el mateix valor en diferents formats però sense repetir el valor:");
        System.out.format("PI = %015.2f  PI = %1$.4f", Math.PI );
        System.out.println();

        System.out.println();


        System.out.format("El salt de linia s'escriu en el codi de format %%n%n" );
        System.out.println("Estic a l'altra línia!!");

        System.out.format("%n    Decimal        Octal Hexadecimal");
        System.out.format("%n %10d %12o %11x", 12345, 12345, 12345);
        System.out.format("%n %7d %1$12o %1$11x", Integer.MAX_VALUE);
        System.out.format("%n %7d %1$12o %1$11X", Integer.MAX_VALUE);




    }

}
