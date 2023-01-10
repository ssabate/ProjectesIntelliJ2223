package nf1;

public class Exercici5 {

    public static void main(String[] args) {
        int any=1900;
        if(bixest(any)) System.out.format("L'any %d és bixest%n", any);
        else System.out.format("L'any %d no és bixest%n", any);
    }


    public static boolean bixest(int year){

        //if(year<1584) return false;

        //«un any és bixest si és divisible per 400, o bé si és divisible per 4 però no per 100»
        //if( year % 400 == 0 || year % 4 == 0 && year % 100 != 0)  return true;
        //else return false;

        return year>=1584 && (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
    }
}
