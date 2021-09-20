package Loops;

import java.util.Scanner;

public class Övning42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //42
        int input = 0;
        int sum = 0;
        System.out.println("Mata in 20 tal så räknar vi ut summan!");
        for(int i = 1; i < 21; i++) {
            /* input */
            System.out.println("Mata in tal nummer " + i + ":");
            input = scan.nextInt();
            sum += input;

        }
        System.out.println(sum);
    }
}
