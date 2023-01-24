package nf1;

public class Exercici11 {

    public static void main(String[] args) {
        System.out.println(buscaCadena("abcdefg", "fg",0));
    }

    public static int buscaCadena(String text, String subcadena, int posicio){
        //Tractament dels casos especials
//        si els 2 Strings o algun d'ells són null el mètode retornarà -1,
//        si el número és negatiu se farà el mateix que si valgués 0,
//        si el segon text és la cadena buida se retornarà el valor més menut entre el número i la llargada del primer text,
//        si el número és superior o igual a la llargada del primer String, se retornarà -1.
        if(text==null || subcadena==null) return -1;
        if(posicio<0) posicio=0;
        if(subcadena.isEmpty()) return (posicio<=text.length()?posicio:text.length());
        if(posicio>=text.length()) return -1;

        //Tractament dels casos no especials
        while(posicio<=text.length()-subcadena.length() &&
                !text.substring(posicio,posicio+subcadena.length()).equals(subcadena)){
            posicio++;
        }
        return (posicio<=text.length()-subcadena.length()?posicio:-1);

        //Equivalent usant indexOf()
        //return text.indexOf(subcadena,posicio);
    }

    public static int buscaCadenaVJoan(String prim, String seg, int num) {
        int cont=0;
        if (prim==null||prim==null)return -1;
        if (num<0)num=0;
        if (seg=="")return num;
        if (num>prim.length())return -1;

        for (int i = num; i <prim.length() ; i++) {
            if (prim.charAt(i) == seg.charAt(0)) {
                for (int j = 1; j < seg.length(); j++) {
                    if (prim.charAt(i + j) == seg.charAt(j)) cont++;
                }
            }
            if (cont == seg.length() - 1) return i;
            cont = 0;

        }
        return -1;
    }
}
