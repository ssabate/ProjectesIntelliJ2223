package nf2;

public class Exercici10 {

    public static void main(String[] args) {
        String text="1  2    3 4     5     4 3      2 1";
        String noEspai="";
        for (int i = 0; i < text.length(); i++) {
            char c=text.charAt(i);
            if( c != ' ' && c!=','&& c!='\'')
                noEspai = noEspai + c;
        }
        System.out.println(text=noEspai);


        int i;
        for(i=0; i <= text.length()/2 - 1; i++){
            char j=text.charAt(text.length()-1-i);
           if (text.charAt(i)!=j) break;
        }
        if( i > text.length()/2 - 1 )
            System.out.println("És palíndrom!!");
        else
            System.out.println("No és palíndrom!!");
    }
}
