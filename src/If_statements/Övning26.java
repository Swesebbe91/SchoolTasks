package If_statements;

import java.util.Scanner;

public class Övning26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

// 26.
        int A = 0, B = 0;

        System.out.println("Mata in tal A");
        A = scan.nextInt();

        System.out.println("Mata in tal B");
        B = scan.nextInt();

        if (A == B) {
            System.out.printf("Talen %s & %s = Lika stora\n", A, B);
        } else {
            if (A > B) {
                System.out.println("A är störst");
            } else
                System.out.println("B är störst");
        }
    }
}
