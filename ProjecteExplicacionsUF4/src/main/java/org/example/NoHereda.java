package org.example;

public class NoHereda {

    public NoHereda(){

    }

    public static void main(String[] args) {
        Herencia h=new Herencia();

        h.propietat4=9;

        h.pensar();

        Filla f=new Filla();
        f.pensar();
    }
}
