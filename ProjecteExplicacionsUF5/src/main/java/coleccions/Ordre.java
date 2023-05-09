package coleccions;

import java.util.Comparator;
import java.util.TreeSet;

public class Ordre {

    public static void main(String[] args) {

        Persona p=new Persona();

        p.getLesMeuesCoses().add(new Cosa(12,"llapis"));
        p.getLesMeuesCoses().add(new Cosa(1,"boli"));
        p.getLesMeuesCoses().add(new Cosa(2,"bici"));
        p.getLesMeuesCoses().add(new Cosa(12,"cotxe"));
        p.getLesMeuesCoses().add(new Cosa(12,"moto"));
        p.getLesMeuesCoses().add(new Cosa(12,"avio"));

        //Ordre natural dels objectes Cosa
        TreeSet<Cosa> col=new TreeSet<>();

        col.add(new Cosa(100, "c"));
        col.add(new Cosa(25,"a"));
        col.add(new Cosa(50,"b"));

        for(Cosa c:col){
            System.out.println(c);
        }

        //Ordre artificial dels objectes de la classe Cosa
        TreeSet<Cosa> colArt=new TreeSet<>(new Comparator<Cosa>(){


            @Override
            public int compare(Cosa o1, Cosa o2) {
                return o2.getCamp2().compareToIgnoreCase(o1.getCamp2());
            }
        });

        colArt.add(new Cosa(100, "a"));
        colArt.add(new Cosa(25,"c"));
        colArt.add(new Cosa(50,"b"));


        for(Cosa c:colArt){
            System.out.println(c);
        }

    }
}

class Persona{

    TreeSet<Cosa> lesMeuesCoses=new TreeSet<>();

    public TreeSet<Cosa> getLesMeuesCoses() {
        return lesMeuesCoses;
    }

    public void setLesMeuesCoses(TreeSet<Cosa> lesMeuesCoses) {
        this.lesMeuesCoses = lesMeuesCoses;
    }
}


class Cosa implements Comparable<Cosa>{

    private int camp1;
    private String camp2;

    public int getCamp1() {
        return camp1;
    }

    public void setCamp1(int camp1) {
        this.camp1 = camp1;
    }

    public String getCamp2() {
        return camp2;
    }

    public void setCamp2(String camp2) {
        this.camp2 = camp2;
    }

    public Cosa(int camp1) {
        this.camp1 = camp1;
    }
    public Cosa(int camp1, String camp2) {
        this.camp1 = camp1;
        this.camp2=camp2;
    }

    //Comparem a this en o
    @Override
    public int compareTo(Cosa o) {
        return this.camp2.compareTo(o.camp2);
        //return o.camp1-this.camp1;
    }

    @Override
    public String toString() {
        return "Cosa{" +
                "camp1=" + camp1 +
                ", camp2='" + camp2 + '\'' +
                '}';
    }
}