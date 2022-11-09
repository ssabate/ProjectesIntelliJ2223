package tipo_problema.bucles_simples;

public class Quadra_t {

    public static void main(String[] args) {
        int m=5, n=4, dim=Integer.max(m, n), cont=0;

        for (int inc = 0; inc < dim; inc++) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if(i+inc < m && j+inc < n)
                        cont++;
                }
            }
        }
        System.out.println(cont);
    }


}
