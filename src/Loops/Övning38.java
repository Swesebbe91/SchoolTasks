package Loops;

import java.util.Scanner;

public class Övning38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 38.
        int invånare = 26000;
        float födda = 0.007f;
        float döda = 0.006f;
        int inflyttade = 300;
        int utflyttade = 325;
        int år = 2016;
        int jämförelseÅr;
        float totalInvånare = 26000f;

        System.out.println("Mata in ett jämförelse år");
        jämförelseÅr = scan.nextInt();
        while (år < jämförelseÅr) {
            float antalFödda = totalInvånare * födda;
            float antalDöda = totalInvånare * döda;
            totalInvånare = totalInvånare + antalFödda - antalDöda + inflyttade - utflyttade;
            System.out.println("År: " + år + " invånare: " + totalInvånare);
            år++;
        }
    }
}
