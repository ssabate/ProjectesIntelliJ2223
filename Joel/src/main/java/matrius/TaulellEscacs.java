package matrius;

import java.util.Scanner;

public class TaulellEscacs {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int f, c;
        
        f = ent.nextInt();
        c = ent.nextInt();

        for (int i = 0; i < f; i++) {
            char c1 = '.', c2 = '#';
            if ( i % 2 != 0) {
                c1 = '#';
                c2 = '.';
            }
            for (int j = 0; j < c; j++) {
                if( j % 2 == 0 ) System.out.format("%c ", c1);
                else System.out.format("%c ", c2);
            }
            System.out.println();
        }
    }
}
