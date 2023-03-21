package excepcions;

public class SantiException extends Exception {

    private int ordre;

    public SantiException(int ordre){
        this.ordre=ordre;
    }

    public int getOrdre() {
        return ordre;
    }

    public void setOrdre(int ordre) {
        this.ordre = ordre;
    }
}

class Main{

    public static void main(String[] args) throws SantiException {
         throw new SantiException(23);



    }



}
