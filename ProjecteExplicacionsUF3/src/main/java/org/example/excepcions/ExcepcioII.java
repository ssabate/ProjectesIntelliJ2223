package org.example.excepcions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcioII {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("Introduix un número enter major que 0:");
        int num=0;
        while(true) {
            try {
                Scanner[] array=new Scanner[10];
                for (int i = 0; true; i++) {
                    array[i]=null;
                }
//                //Scanner ent2=null;
//                //if(ent2!=null) ent2.nextInt();
//                //num = Integer.parseInt(ent.nextLine());
//                if(num%2 == 0) System.out.println(num/0);
//                if(num<=0) throw new NumberFormatException();
//                System.out.println(num);
//                break;
            }//catch(Exception ex) {
//                System.out.println("Houston, tenemos un problema!!");
//            }
            //}
            catch(IndexOutOfBoundsException ex){

            }
            catch (NumberFormatException ex) {
                //System.out.println(ex);
                System.out.println("Introduix un enter major que 0!!. Torna-ho a internar:");
            }catch (InputMismatchException ex) {
                //System.out.println(ex);
                System.out.println("Introduix un enter major que 0!!. Torna-ho a internar:");
            }catch(ArithmeticException ex){
                System.out.println("Has intentat dividir per 0!!");
            }
//            }catch(Exception ex){
//                System.out.println("Houston, tenemos un problema!!");
//            }

        }
    }

}
