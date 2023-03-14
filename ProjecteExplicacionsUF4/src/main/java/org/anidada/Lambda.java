package org.anidada;

import java.util.Scanner;
class Implementa implements NoFuncional{


    @Override
    public void fesAlgo(int param) {

    }

    @Override
    public void fesAlgoMes(int param) {

    }
}

public class Lambda {
    //Propietats no estàtiques de la classe
    Scanner ent=new Scanner(System.in);

    NoFuncional prop=new NoFuncional(){   //Creació d'una classe anònima
        @Override
        public void fesAlgo(int param) {
            System.out.println("Estic al mètode fesAlgo de la propietat!!");
        }

        @Override
        public void fesAlgoMes(int param) {
            System.out.println("Estic al mètode fesAlgoMes de la propietat!!");

        }


    };

    Funcional func=new Funcional(){
        @Override
        public void fesAlgo(int param) {
            System.out.println(param);
        }
    };


    Funcional lambda= param -> {
        int a=67;
        if(param*a>234) System.out.println(param);
        else System.out.println(param/8);
    };

    FuncionalVarisParametres lambda2=(char c1,double dinamita)->{
        if(c1=='a');
        //Codi de la funció
        return 12;
    };


    public static void main(String[] args) {
        Lambda l=new Lambda();
        l.prop.fesAlgo(245);
        l.prop.fesAlgoMes(6785);
        l.func.fesAlgo(56);
    }


}

interface Funcional{            //Interfície funcional --> 1 sol mètode abstracte

    void fesAlgo(int param);

}

interface NoFuncional{            //Interfície no funcional --> no té 1 sol mètode abstracte

    void fesAlgo(int param);
    void fesAlgoMes(int param);

}

interface FuncionalVarisParametres{

    int fesAlgoEnVarisParams(char c, double d);
}