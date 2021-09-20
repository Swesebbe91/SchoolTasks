package Loops;

import java.util.Scanner;

public class Övning53 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int input;
        int sum = 0;
        System.out.println("Mata in 10 korrekta tal (mellan 5000-10 000)");

        for(x = 1; x < 11;) {
            System.out.println("Mata in tal: " + x);
            input = scan.nextInt();
            if (input > 5000 && input < 10000) {
                sum += input;
                x++;
            }
        }
        System.out.println("Summan är: " + sum + " Medelvärdet är: " + sum/x);

    }
}
