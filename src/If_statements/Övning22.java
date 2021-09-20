package If_statements;

import java.util.Scanner;

public class Övning22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //22.
        int tal = 0;
        System.out.println("Mata in ett tal");
        tal = scan.nextInt();

        if (tal >= 0 && tal <= 4 || tal > 5 && tal <= 9)
            System.out.println("Talet är mellan 0-4 eller 6-9");
        else {
            System.out.println("Talet är 5 eller lägre än 0 eller högre än 10");
        }
    }
}
