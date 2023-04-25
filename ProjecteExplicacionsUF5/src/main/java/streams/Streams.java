package streams;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

import static java.awt.Color.GREEN;
import static java.awt.Color.RED;

public class Streams {

//    Collection<Widget> widgets=new …;
//    int sum = widgets.stream()
//            .filter(w -> w.getColor() == RED)
//            .mapToInt(w -> w.getWeight())
//            .sum();


    public static void main(String[] args) {

        Collection<Widget> widgets=new ArrayList<>();
        widgets.add(new Widget(RED, 45));
        widgets.add(new Widget(RED, 5));
        widgets.add(new Widget(Color.BLACK, 45));

        int sum = 0;
        for (Widget w:widgets){
            if(w.getColor() == RED) sum+=w.getWeight();
        }

        sum = widgets.stream()
            .filter(w -> w.getColor() == RED)
            .mapToInt(w -> w.getWeight())
            .sum();


        Stream<Widget> stream=widgets.stream();

        sum=stream.filter(w -> w.getColor() == RED)
                .mapToInt(w -> w.getWeight())
                .sum();

        System.out.println(sum);

        stream=widgets.stream();
        sum=stream.filter(w -> w.getColor() == GREEN)
                .mapToInt(w -> w.getWeight())
                .sum();

        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2);

        System.out.println(streamIterated.limit(2).mapToInt(w -> w).sum());
        //while(true);
    }

}

class Widget{

    private Color color;
    private int weight;

    public Widget(Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
