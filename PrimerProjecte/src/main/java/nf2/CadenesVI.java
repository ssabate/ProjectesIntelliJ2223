package nf2;

public class CadenesVI {

    public static void main(String[] args) {

        if("hola".equals("HOLA")) System.out.println("iguals");
        else System.out.println("diferents");

        if("hola".equalsIgnoreCase("HOLA")) System.out.println("iguals");
        else System.out.println("diferents");


        if("hola".compareTo("HOLA") == 0 ) System.out.println("iguals");
        else if("hola".compareTo("HOLA") < 0) System.out.format("%s menor %s%n", "hola", "HOLA");
        else System.out.format("%s major %s%n", "hola", "HOLA");

        if("hola".compareToIgnoreCase("HOLA") == 0 ) System.out.println("iguals");
        else if("hola".compareToIgnoreCase("HOLA") < 0) System.out.format("%s menor %s", "hola", "HOLA");
        else System.out.format("%s major %s", "hola", "HOLA");

        System.out.println("abc".compareTo("aB"));
        System.out.println("abc".compareTo("aC"));


    }
}
