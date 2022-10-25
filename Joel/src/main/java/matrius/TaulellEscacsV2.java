package matrius;

import java.util.Scanner;

public class TaulellEscacsV2 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int f, c;
        
        f = ent.nextInt();
        c = ent.nextInt();

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                if( (j-i) % 2 == 0 ) System.out.format(". ");
                else System.out.format("# ");
            }
            System.out.println();
        }
    }
}
