package org.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
//        Stream<String> streamGenerated =
//                Stream.generate(() -> "element");
//        streamGenerated.forEach(p-> System.out.println(p));
//        Stream<String> prova=Stream.<String>generate(()->((Integer)new Random().nextInt(1000)).toString());
//        prova.forEach(p-> System.out.println(p));

//        IntStream prova2=new Random().ints(100);
//        prova2.forEach(p-> System.out.println(p));

//        Optional<Integer> streamIterated = Stream.iterate(40, n -> n + 2).reduce((a, b)->a+b);

//        List<String> list = Arrays.asList("abc1", "abc2", "abc3");
//        Stream<String> stream = list.stream().filter(element -> {
//            System.out.println("Estic filtrant!!");
//            return element.contains("2");
//
//        });
//
//        System.out.println(stream.count());
//        Stream<String> stream =
//                Stream.of("a", "b", "c").filter(element -> element.contains("b"));
//        Optional<String> anyElement = stream.findAny();
//        Optional<String> firstElement = stream.findFirst();
        List<Integer> numbers = Arrays.asList(3, 7, 1, 9, 4, 6, 8, 2, 5);

        Optional<Integer> maxNumber = numbers.stream()
                .max(Integer::compare);

        System.out.println("The maximum number is: " + maxNumber.get());

        //numbers = new ArrayList<>();

        maxNumber = numbers.stream()
                .max(Integer::compare);

        System.out.println("The maximum number is: " + maxNumber.orElse(0));
    }
}

class Product{
     private int id;
        private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}