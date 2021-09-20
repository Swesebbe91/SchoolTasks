package Loops;

import java.util.Scanner;

public class Övning37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 37.
        int mittTal;
        int i = 0;
        int tal = 0;
        int svar;
        System.out.println("Hur många tal vill du ange?");
        mittTal = scan.nextInt();

        for(i = 0; i < mittTal; i++) {
            System.out.printf("Mata in tal %d: ", i + 1);
            tal = scan.nextInt();
            System.out.println(tal);
        }

    }
}
