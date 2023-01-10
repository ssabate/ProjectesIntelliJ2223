package nf1;

import static nf1.Exercici38.dataCorrecta;

public class Exercici40 {

    public static void main(String[] args) {
        System.out.println(comparaDates(15,2,2023,10,2,2023));

    }

    public static int comparaDates(int dia1, int mes1, int any1,int dia2, int mes2, int any2){
        //Primer mirem si hi ha alguna data incorrecta
        if(!dataCorrecta(dia1,mes1,any1) || !dataCorrecta(dia2,mes2,any2)) return -2;

        //Si arribem aquí sabem que les dates són correctes

        //Primer mirem els anys
        if(any1<any2) return -1;
        else if(any1>any2) return 1;

        //Si arribem aquí vol dir que les 2 dates són del mateix any

        //A continuació mirem els mesos
        if(mes1<mes2) return -1;
        else if(mes1>mes2) return 1;

        //Si arribem aquí vol dir que les 2 dates són del mateix any i el mateix mes

        //A continuació mirem els dies
        if(dia1<dia2) return -1;
        else if(dia1>dia2) return 1;

        //Si arribem aquí vol dir que les 2 dates són del mateix any i el mateix mes i el mateix dia
        return 0;
    }

}
