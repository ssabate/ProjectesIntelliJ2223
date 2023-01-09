package com.iesebre;

public class ModularIII {

    //Pas de paràmetres per valor en tipos primitius i String
    public static void main(String[] args) {
        boolean varBooleana=true;
        demostracioParametres(varBooleana);

        System.out.println(varBooleana);

    }

    public static void demostracioParametres(boolean param){
        if(param) System.out.println("Entro al l'if");
        else System.out.println("Entro a l'else");

        param=!param;

        System.out.println(param);


    }


    public static boolean esSolucio(char[][] taulell, boolean torn, Boolean solucio, char c, int i, int j){

        if(taulell[i][0]==c && taulell[i][1]==c && taulell[i][2]==c ||
                taulell[0][j]==c && taulell[1][j]==c && taulell[2][j]==c) return true;

        boolean esSolucio=true;
        for (int k = 0; k < taulell.length && esSolucio; k++) {
            esSolucio = esSolucio && taulell[i][k]==c;
        }
        return true;
    }

}
