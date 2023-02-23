package org.example;

public class Herencia {

    public int propietat1;
    private int propietat2;

    protected int propietat3;

    int propietat4;

    public Herencia(){
        this.propietat1=25;
        this.propietat2=3;
        this.propietat3=8;
        this.propietat4=6;
    }

    public void pensar(){
        //codi del pare
        System.out.println("Sóc el pare");

    }

}


class Filla extends Herencia{

    public Filla(){
        this.propietat1=9;
        this.propietat3=8;
        this.propietat4=4;
    }

    public void pensar2(){
        this.pensar();

    }

//    public void pensar(){
//        //el codi del fill
//        System.out.println("Sóc la filla");
//
//    }
}

