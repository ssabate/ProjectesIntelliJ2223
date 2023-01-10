package nf1;

import static nf1.Exercici39.diaSeguent;
import static nf1.Exercici40.comparaDates;

public class Exercici41 {

    public static void main(String[] args) {
        System.out.println(diferenciaDies(17,10,2004,10,1,2023));
    }

    public static int diferenciaDies(int dia1, int mes1, int any1,int dia2, int mes2, int any2){
        //Variables locals del mètode
        int compDat=comparaDates(dia1,mes1,any1,dia2,mes2,any2);    //Comparo les dates una sola vegada
        //Primer mirem si hi ha alguna data incorrecta

        if( compDat == -2) return -1;

        //Si arribem aquí sabem que les dates són correctes
        //Vaig a mirar si la primera data és menor o igual que la segona, i sinó les intercanviem
        if( compDat == 1 ) {  //Si això és cert significa que la primera data és major que la segona --> intercanviem
            //Per intercanviar 2 valors enters necessitem una variable temporal entera
            int temp;
            temp=dia1;
            dia1=dia2;
            dia2=temp;

            temp=mes1;
            mes1=mes2;
            mes2=temp;

            temp=any1;
            any1=any2;
            any2=temp;
        }

        //Aquí sabem que la primera data és menor o igual que la segona --> SEGUR!!

        //Farem un bucle que comptarà quants dies hi ha entre les dates
        int compt=0;

        while(comparaDates(dia1,mes1,any1,dia2,mes2,any2)!=0){
            //Passem la data inicial al dia seguent
            int[] dia=diaSeguent(dia1, mes1, any1);
            dia1=dia[0];
            mes1=dia[1];
            any1=dia[2];

            //Comptem que ha passat un dia
            compt++;
        }

        return compt;
    }


}
