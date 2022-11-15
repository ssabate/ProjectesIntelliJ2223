package nf3;

import java.util.Scanner;

public class VectorsI {

    public static void main(String[] args) {
        Scanner ent;
        ent = new Scanner(System.in);

        //Declaració de variables no vector
        int numero;
        String text;

        //Instanciació d'una variable no vector
        numero=1;
        text=new String("Sóc un text");

        //Declaració de vectors
        int[] vector;
        char cadena[];
        float     [] temperatures;
        String[] linies;

        //Instanciació de vectors
        vector = new int[3];   //Molt important!! Una vegada declarada
        //la dimensió del vector ja no la podem canviar
        cadena = new char[23];
        temperatures = new float[3];
        linies= new String[3];

        //Declaració i instanciació de vectors en una sola instrucció
        int[] diesMesos = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //El mateix però en 2 instruccions separades
        int[]  diesMesosBixest;
        diesMesosBixest=new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        //Accés a les caselles d'un vector
        numero++;
        numero = numero + 1;
        numero += 1;

        //Accedim a la casella en index 1, o sigue, la 2ª casella del vector
        diesMesos[1]++;
        diesMesos[1] = diesMesos[1] + 1;
        diesMesos[1] += 1;
        diesMesos[1] = 28;

        //Recorregut d'un vector utilitzant estructures repetitives

        for (int i = 0; i < diesMesos.length; i++) {
            System.out.format("El mes %d té %d dies%n", i+1, diesMesos[i]);
        }

        for (int i = diesMesos.length-1; i >= 0; i--) {
            System.out.format("El mes %d té %d dies%n", i+1, diesMesos[i]);
        }

        System.out.println("Introduix un número de mes (1-12):");
        int mesTriat=ent.nextInt();
        if(mesTriat<1 || mesTriat > 12) System.out.println("Mes incorrecte!!");
        else
            System.out.format("El mes %d té %d dies%n", mesTriat, diesMesos[mesTriat-1]);
















    }
}
