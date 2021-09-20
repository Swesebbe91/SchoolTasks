package Loops;

import java.util.Scanner;

public class Övning54 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x;
        int positivAntal = 0;
        int negativAntal = 0;
        int input;

        for (x = 1; x < 11; x++) {
            System.out.println("Mata in 100 tal så kollar vi hur många som är negativa respektive positva");
            System.out.println("Tal nummer " + x);
            input = scan.nextInt();

            if (input > 0) {
                positivAntal += 1;
            } else {
                negativAntal += 1;
            }
        }
        System.out.println("Antalet positiva är: " + positivAntal);
        System.out.println("Antalet negativa är: " + negativAntal);
    }
}

