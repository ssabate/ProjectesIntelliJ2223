package nf1;

public class Exercici38 {

    public static void main(String[] args) {
        int d=31, m=4, a=2020;

        if(dataCorrecta(d,m,a)) System.out.println("La data és correcta");
        else System.out.println("La data no és correcta");
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
    public static boolean bixest(int year){
           return year>=1584 && (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
    }

}
