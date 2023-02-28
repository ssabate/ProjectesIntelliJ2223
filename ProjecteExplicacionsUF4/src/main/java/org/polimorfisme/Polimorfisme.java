package org.polimorfisme;

public class Polimorfisme {

    //Sobrecàrrega de mètodes
    public void metodeSobrecarregat(){
        System.out.println("Encara no sóc un mètode sobrecarregat!!");
    }

//    public int metodeSobrecarregat(){
//        return 4;
//    }

    public void metodeSobrecarregat(String text){
        System.out.println("Sóc un mètode sobrecarregat en text "+text);
    }

    public void metodeSobrecarregat(int numero){
        System.out.println("Sóc un mètode sobrecarregat en text "+numero);
    }

}

class Main{

    public static void main(String[] args) {
        Polimorfisme p=new Polimorfisme();

        p.metodeSobrecarregat();
        p.metodeSobrecarregat("hola");
        p.metodeSobrecarregat(34);
    }

}
