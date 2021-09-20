package If_statements;

import java.util.Scanner;

public class Övning25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 25.
        int tal = 0;
        System.out.println("Läs in ett tal så kollar vi om det är positivt eller negativt");
        tal = scan.nextInt();
        if (tal > 0) {
            System.out.println("Talet är positivt");
        } else
            System.out.println("Talet är negativt");
    }
}
