package Loops;

import java.util.Scanner;

public class Övning52 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int tal;
        int sum = 0;
        int input;
        for(tal = 1; tal < 11; tal++) {
            System.out.println("Mata in ett tal så kollar vi hur många som är positiva");
            System.out.println("tal: " + tal);
            input = scan.nextInt();
            if (input > 0) {
                sum += input;

            }
        }
        System.out.println("Summan av talen är: " + sum);
    }
}
