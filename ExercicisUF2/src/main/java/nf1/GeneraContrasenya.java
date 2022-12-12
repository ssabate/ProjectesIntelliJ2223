package nf1;

import static nf1.Exercici1.retornaCaracter;

public class GeneraContrasenya {

    public static void main(String[] args) {

        System.out.println(generaContrasenya(20, 'A', 'z'));
    }

    //Genera una contrasenya de longitud caràcters formada per caràcters dins l'interval [car1..car2] o [car2..car1]
    public static String generaContrasenya(int longitud, char car1, char car2){
        String contrasenya="";
        for (int i = 0; i < longitud; i++) {
            contrasenya = contrasenya + retornaCaracter(car1, car2);
        }

        return contrasenya;
    }



}
