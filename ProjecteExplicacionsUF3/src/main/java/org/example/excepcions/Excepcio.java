package org.example.excepcions;

import org.example.entitats.Vent;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepcio {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.println("Introduix un número enter major que 0:");
        int num=0;
        while(true) {
            try {
                num = ent.nextInt();
                if(num<=0) throw new InputMismatchException();
                System.out.println(num);
                break;
            } catch (InputMismatchException ex) {
                //System.out.println(ex);
                System.out.println("Introduix un enter major que 0!!. Torna-ho a internar:");

                ent.next();             //Això evita el bucle infinit!!
            }
        }
    }

}
