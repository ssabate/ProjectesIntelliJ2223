package exemplemvc.model;

public class Pojo {

    private int numClics=0;

    public Pojo(){

    }

    public Pojo(int valor){
        numClics=valor;
    }

    public int getNumClics() {
        return numClics;
    }

    public void setNumClics(int numClics) {
        this.numClics = numClics;
    }
}
