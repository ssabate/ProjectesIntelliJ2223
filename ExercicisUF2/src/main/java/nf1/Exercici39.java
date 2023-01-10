package nf1;

import java.util.Arrays;

import static nf1.Exercici38.dataCorrecta;

public class Exercici39 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(diaSeguent(32,4,0)));
    }

    public static int[] diaSeguent(int dia, int mes, int any){
        if(!dataCorrecta(dia,mes,any)) return null;

        //A partir d'aquí sabem que és una data correcta
        //Provem simplement sumant un dia a la data rebuda
        if(dataCorrecta(dia+1,mes,any)) return new int[]{dia+1, mes, any};

        //A partir d'aquí sabem que no n'hi ha prou en sumar un dia
        //Provem si n'hi ha prou en passar al dia 1 del mes següent
        if(dataCorrecta(1,mes+1,any)) return new int[]{1, mes+1, any};

        //A partir d'aquí sabem que no n'hi ha prou en sumar un dia, ni en passar al primer dia del mes següent
        //Passem al dia 1 de gener de l'anysegüent
        return new int[]{1, 1, any+1};
    }


}
