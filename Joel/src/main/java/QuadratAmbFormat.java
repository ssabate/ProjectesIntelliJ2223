import java.util.Locale;
import java.util.Scanner;

public class QuadratAmbFormat {

    public static void main(String[] args) {

        Scanner ent=new Scanner(System.in);
        Locale.setDefault(Locale.ENGLISH);
        float f = ent.nextFloat();
        System.out.format("%015.3f", f * f );
    }
}