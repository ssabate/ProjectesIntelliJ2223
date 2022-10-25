package nf2;

public class CadenesVII {

    public static void main(String[] args) {

        if("hola".startsWith("ho")) System.out.println("Si");
        else System.out.println("No");

        if("hola".startsWith("o")) System.out.println("Si");
        else System.out.println("No");

        if("hola".endsWith("ola")) System.out.println("Si");
        else System.out.println("No");

        if("hola".endsWith("ol")) System.out.println("Si");
        else System.out.println("No");

        if("Anem a buscar un troç de text".contains("de text")) System.out.println("Si");
        else System.out.println("No");

        if("Anem a buscar un troç de text".contains("DE")) System.out.println("Si");
        else System.out.println("No");

    }


}
