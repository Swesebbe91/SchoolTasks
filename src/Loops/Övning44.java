package Loops;

import java.util.Scanner;

public class Övning44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //44
        int sum = 0;
        int input;
        int tal;
        System.out.println("Mata in hur många tal du vill mata in");
        tal = scan.nextInt();
        for(int x = 0 ;x < tal; x++) {
            System.out.printf("Mata in tal %d ett tal så summerar vi det: %n", x + 1);
            input = scan.nextInt();
            sum += input;

        }
        System.out.printf("Total summan av de %d talen är: %d ", tal, sum);
    }
}
