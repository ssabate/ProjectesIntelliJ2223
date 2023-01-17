package nf1;

public class Exercici31 {

    public static void main(String[] args) {
        double b=10.2;
        int e=177;
        System.out.println(potenciaRec(b,e));
        System.out.println(potenciaIt(b,e));
    }

    public static double potenciaRec(double base, int exponent){

        if(exponent==0) return 1.0;
        if(exponent>0) return base * potenciaRec(base, exponent-1);

        //Aquí sabem que l'exponent és negatiu, segur!!
        return 1.0 / potenciaRec(base, -exponent);
    }

    public static double potenciaIt(double base, int exponent){

        if(exponent==0) return 1.0;

        double resultat=1.0;
        boolean negatiu=exponent<0;

        //Si l'exponent és negatiu li canviem el signe --> lo passe a positiu
        if(negatiu){
            exponent=exponent*-1;
        }

        //Aquí l'exponent sempre serà positiu
        for (int i = 0; i < exponent; i++) {
            resultat=resultat*base;
        }

        if(negatiu) return 1.0/resultat;
        else return resultat;
    }



}
