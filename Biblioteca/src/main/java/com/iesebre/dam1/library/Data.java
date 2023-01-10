package com.iesebre.dam1.library;

public class Data {

    public static boolean bixest(int year){

        //if(year<1584) return false;

        //«un any és bixest si és divisible per 400, o bé si és divisible per 4 però no per 100»
        //if( year % 400 == 0 || year % 4 == 0 && year % 100 != 0)  return true;
        //else return false;

        return year>=1584 && (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
    }

    public static boolean dataCorrecta(int dia, int mes, int any){
        //Vector que conté la durada en dies dels mesos de l'any
        int[] diesMes=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        //Modifico la durada del febrer si l'any és bixest
        if(bixest(any)) diesMes[1]=29;

        //Tractem els valors on retornem fals directament
        if(dia<1 || dia>31 || mes<1 || mes>12 ) return false;

        //sabem que 1<= dia <=31 i 1<= mes <=12
        //if(dia>28){
        //if(mes == 1 || mes ==3 ...)
        //    if(dia<=diesMes[mes-1]) return true;
        //   else return false;
        //}

        //sabem que 1<= dia <=28 i 1<= mes <=12
        //return true;

        return dia<=diesMes[mes-1];
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
