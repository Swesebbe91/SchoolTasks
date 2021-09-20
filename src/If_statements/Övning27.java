package If_statements;

import java.util.Scanner;

public class Övning27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 27.
        int A = 0;
        int B = 0;
        int C = 0;

        System.out.println("Mata in tal A");
        A = scan.nextInt();

        System.out.println("Mata in tal B");
        B = scan.nextInt();

        System.out.println("Mata in tal C");
        C = scan.nextInt();

        if (A < B && A < C) {
            System.out.println("A är minst");
        } else {
            if (B < C) {
                System.out.println("B är minst");
            } else
                System.out.println("C är minst");
        }

    }
}
