package coleccions;

import java.util.*;

public class Coleccio implements List {

    private int[] dades=new int[1000];

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        //throw new UnsupportedOperationException();
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}

class Main{

    public static void main(String[] args) {
        //Coleccio c=new Coleccio();


        //Colecció no genèrica
        ArrayList c=new ArrayList();

        c.add("Hola");

        c.add(45);

        c.add(new Scanner(System.in));

        System.out.println(c.get(0));
        if(c.contains(45)) System.out.println("Trobat");

        System.out.println("Introduix un numero:");

        int suma=((Scanner)c.get(2)).nextInt() + (Integer)c.get(1);

        System.out.println(suma);



    }
}

class Main2{

    public static void main(String[] args) {


        //Colecció no genèrica
        ArrayList<String> c=new ArrayList<>();

        c.add("Hola");
        c.add("bon");
        c.add("dia");

        System.out.println(c.get(0)+" "+c.get(1)+" "+c.get(2));







    }
}