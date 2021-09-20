package Loops;

import java.util.Scanner;

public class Övning62 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input;
        int i;
        int antal = 0;
        System.out.println("Läs in 10 tal!");
        for (i = 1; i < 11; i++) {
            System.out.println("Tal: " + (i));
            input = scan.nextInt();

            if (input > 5000 && input < 10000) {
                antal += 1;
            }
        }
        if (antal == 10) {
            System.out.println("RÄTT!");
        } else {
            System.out.println("FEL! Alla tal är inte mellan 5000 & 10 00");
        }
    }
}