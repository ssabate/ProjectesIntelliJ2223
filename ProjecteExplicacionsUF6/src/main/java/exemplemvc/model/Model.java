package exemplemvc.model;

public class Model {

    private Pojo[] dades=new Pojo[2];

    private int index=0;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Pojo[] getDades() {
        return dades;
    }

    public void setDades(Pojo[] dades) {
        this.dades = dades;
    }
}
