package nf3;

import java.util.Random;
import java.util.Scanner;

public class Exercici9 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Random r=new Random();
        int[] comptadors=new int['Z'-'A'+1];
        int n, index=0, candidat=2;

        do {
            System.out.println("Introduix un número enter positiu:");
            n =ent.nextInt();
            if(n<1) System.out.println("Ha de ser major que 0!!");
            else break;
        }while(true);

        System.out.println("Caràcters aleatoris:");
        //Generem i mostrem n lletres aleatòries entre la A i la Z
        for (int i = 0; i < n; i++) {
            //Calculem una lletra aleatòriament --> més aviat és l'índex de la lletra
            int lletra=r.nextInt('Z'-'A'+1);
            //Incrementem la casella de la lletra
            comptadors[lletra]++;
            //Mostrem la lletra apareguda
            System.out.format("%c", lletra + 'A' );

        }

        for (int i = 0; i < comptadors.length; i++) {
            if(comptadors[i]!=0) System.out.format("%nLa lletra %c ha aparegut %d vegades.", 'A'+ i, comptadors[i]);
        }


/*        //instanciem el vector ara que sabem el valor del número a tractar
        vector = new int[Math.round((float)(Math.log(num) / Math.log(2)))];

        System.out.format("Descomposició factorial de %d:%n", num);
        while(num!=1){
            if( num % candidat == 0){
                num /= candidat;
                vector[index] = candidat;
                index++;
            } else candidat++;
        }

        //Mostro la descomposició en factors primers recorrent el vector de dreta a esquerra
        for (int i = index-1; i >= 0 ; i--) {
            System.out.format("%d * ", vector[i]);
        }
        System.out.println("1");
 */   }

}
