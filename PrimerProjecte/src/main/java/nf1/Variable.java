package nf1;

public class Variable {  // nom classes --> PascalCase

    public static void main(String[] args) {

        //Zona de declaració de variables
        int numero; //declaració de variable
        numero = 25;//inicialització de la variable

        char lletra;

        int any = 2023;  //--> variable de tipo int i nom any
        byte mes = 9;   //declaració + inicialització de variable
        short diaMes = 12;    // nom de variables --> camelCase
        double _1real = 2.3;
        double real=3.4;

        double real1, real2 = 3.4;    //Declaro 2 variables del mateix tipo
        boolean int1=true;

        //Codi del programa
        System.out.println("Estem a l'any "+any);
        System.out.println("Estem al mes "+mes+1);
        System.out.println("Estem al dia "+(diaMes+1));

        System.out.println("Estem a l'any "+any+" i al mes "+mes+" i al dia "+(diaMes+1));

        //Inicialitzo la lletra
        lletra = 'a';

        //System.out.println(real1);

    }
}
