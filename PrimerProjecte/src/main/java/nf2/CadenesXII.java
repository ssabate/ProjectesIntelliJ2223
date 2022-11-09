package nf2;

public class CadenesXII {

    public static void main(String[] args) {
        /*
        //Només indiquem l'índex inicial
        System.out.println("abcde".substring(2));
        //System.out.println("abcde".substring(-22));
        System.out.println("abcde".substring(0));
        System.out.println("abcde".substring("abcde".length()-1 ));
        System.out.println("abcde".substring("abcde".length()));
        //System.out.println("abcde".substring("abcde".length()+1));
        */

        //Indiquem tant l'índex inicial com el final
        String text="abcde";

        for (int i = 0; i <= text.length() ; i++) {
            System.out.println(text.substring(0, 4));
        }

        System.out.println(text.substring(2, 0));

    }
}
