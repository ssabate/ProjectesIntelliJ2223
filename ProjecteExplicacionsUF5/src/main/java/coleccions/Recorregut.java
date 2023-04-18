package coleccions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Recorregut {

    public static void main(String[] args) {

        ArrayList<Integer> col=new ArrayList<>();

        col.add(56);
        col.add(456);
        col.add(5);

        for (int i = 0; i < col.size(); i++) {
            System.out.println(col.get(i)); //col[i]
        }

        System.out.println();

        for(Integer element:col){
            System.out.println(element);
        }

        System.out.println();
        Iterator it=col.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println();
        ListIterator lit=col.listIterator();

        while(lit.hasNext()){
            System.out.println(lit.next());
        }
        while(lit.hasPrevious()){
            System.out.println(lit.previous());
        }


    }


}
