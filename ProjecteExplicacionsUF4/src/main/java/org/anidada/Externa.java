package org.anidada;

public class Externa {



    public int prop;

    public int getProp() {
        return prop;
    }

    public void setProp(int prop) {
        this.prop = prop;
    }

    public static class Estatica{  //al ser estàtica, no podem accedir als membres no estàtics de la classe externa

        private int propietat;

        public int getPropietat() {
            return propietat;
        }

        public void setPropietat(int prop) {
            this.propietat = prop;
        }
    }


    public class Inner{    //al NO ser estàtica, SÍ podem accedir als membres no estàtics de la classe externa

        private boolean estic;

        public boolean isEstic() {
            Externa.this.prop=90;       //Accedim a la propietat de la classe externa
            this.estic=false;           //Accedim a la propietat de la inner
            return estic;
        }

        public void setEstic(boolean estic) {
            this.estic = estic;
        }


    }
}

class Main{

    public static void main(String[] args) {
        Externa e=new Externa();
        Externa.Estatica ee=new Externa.Estatica();     //Forma d'instanciar un objecte d'una classe anidada estàtica
        Externa.Inner ei=e.new Inner();                 //Forma d'instanciar un objecte d'una inner class

        e.setProp(54);
        System.out.println(e.getProp());

        ee.setPropietat(45);
        System.out.println(ee.getPropietat());
    }


}
