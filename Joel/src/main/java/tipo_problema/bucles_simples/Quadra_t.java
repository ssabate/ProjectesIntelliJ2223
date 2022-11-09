package tipo_problema.bucles_simples;

import java.util.Scanner;

public class Quadra_t {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int numCasos = ent.nextInt();

        for (; numCasos > 0; numCasos--) {

            int m = ent.nextInt(),
                    n = ent.nextInt(),
                    min = Integer.min(m, n),
                    cont = 0;

            for (int inc = 0; inc < min; inc++) {
                for (int i = 0; i + inc < m; i++) {
                    for (int j = 0; j + inc < n; j++) {
                        cont++;
                    }
                }
            }
            System.out.println(cont);
        }
    }

}
