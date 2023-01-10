package com.iesebre.library;


import java.util.Random;

public class Cadenes {

    public static char retornaCaracter(){
        Random r=new Random();
        return (char) (r.nextInt('{' - ' ' + 1 ) + ' ' );
    }
    public static char retornaCaracter(char car1, char car2){
        Random r=new Random();

        if(car1>=car2) return (char) (r.nextInt(car1 - car2 + 1 ) + car2 );
        else return (char) (r.nextInt(car2 - car1 + 1 ) + car1 );
    }

}




