package nf2;

public class CadenesXI {

    public static void main(String[] args) {

        int index;

        System.out.println( index = "15654656542383747438473725".indexOf('2')      );
        index++;
        System.out.println( index = "15654656542383747438473725".indexOf('2', index)      );
        index++;
        System.out.println( "15654656542383747438473725".indexOf('2', index)      );

        //Vull buscar totes les aparicions d'un caràcter dins d'un text
        index = 0;
        do {
            System.out.println( index = "15065046506050fghgfhgtf4020308030704074030804070307020050".indexOf('0', index)      );
            //if(index == -1) break;
            if( index != -1 ) index++;

        }while ( index != -1 );






    }
}
