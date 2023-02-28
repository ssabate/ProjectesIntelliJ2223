package org.example;

public class Main {

    public static void main(String[] args) {
        Herencia h=new Herencia();
        Herencia h1=new Filla();

        Filla f=new Filla();
        Filla f1= (Filla) new Herencia();

    }
}
