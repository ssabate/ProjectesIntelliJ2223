package coleccions;

public class Generics {

    public static void main(String[] args) {

        Capsa<String> nom=new Capsa<>("Santi");

        nom.setObjecte("Santiago");

        Capsa<Integer> edat=new Capsa<>(67);
        edat.setObjecte(78);

        Capsa.<Long>metodeGeneric(23L);
        Capsa.metodeGeneric("bon dia");
    }

}



class Capsa<T>{

    T objecte;

    public T getObjecte() {
        return objecte;
    }

    public void setObjecte(T objecte) {
        this.objecte = objecte;
    }

    public Capsa(T objecte){
        this.objecte=objecte;

    }

    public static <U> void metodeGeneric(U param){
        System.out.println(param);

    }

}

class NoGenerica<T>{


    public void metodeNoGeneric(T param){
        System.out.println(param);

    }
    public static <U> void metodeGeneric(U param){
        System.out.println(param);

    }

}
