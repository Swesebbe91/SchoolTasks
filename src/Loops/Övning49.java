package Loops;

import java.util.Scanner;

public class Övning49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x, n;
        int i = 0;
        System.out.println("Mata in x");
        x = scan.nextInt();

        System.out.println("Mata in n");
        n = scan.nextInt();

        while (i < n) {
        x = x * n;

        i++;
        }
        System.out.println(x);
    }
}
