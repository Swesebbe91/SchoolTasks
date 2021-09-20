package If_statements;

import java.util.Scanner;

public class Övning30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 30.
        int tal;
        System.out.println("Mata in ett tal: ");
        tal = scan.nextInt();

        if (tal < 10) {
            System.out.println("Talet är mindre än 10");
        } else {
            if (tal < 100) {
                System.out.println("Talet är mindre än 100");
            } else
                System.out.println("talet är större än 100");
        }
    }
}
