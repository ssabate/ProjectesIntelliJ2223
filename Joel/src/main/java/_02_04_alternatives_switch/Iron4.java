package _02_04_alternatives_switch;

import java.util.Scanner;

public class Iron4 {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        String linia = "";

        //Llegim les dades --> una sola línia de text
        linia = ent.nextLine();

        //tractem l'entrada i mostre la sortida
        switch(linia){
            case "Q":
                System.out.println("Skill 1");
                break;
            case "W":
                System.out.println("Skill 2");
                break;
            case "E":
                System.out.println("Skill 3");
                break;
            case "R":
                System.out.println("Ultimate");
                break;
            case "B":
                System.out.println("Recall");
                break;
            case "D":
            case "F":
                System.out.println("Bronzes never use summoners");
                break;
            default:
                System.out.println("Error");


        }

    }
}
