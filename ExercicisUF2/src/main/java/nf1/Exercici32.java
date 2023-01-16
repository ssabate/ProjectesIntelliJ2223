package nf1;

import static com.iesebre.dam1.library.Numero.fibonacci;

public class Exercici32 {

    public static void main(String[] args) {

        for (int i = 0; i < 47; i++) {
            System.out.format("F(%d)=%d%n",i,fibonacci(i));

        }

    }
}
