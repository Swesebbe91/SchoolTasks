package If_statements;

import java.util.Scanner;

public class Övning21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //21.
        int tal = 0;

        System.out.println("Skriv ett tal så testar vi om talet är mindre än -10 eller högre än +10");
        tal = scan.nextInt();

        if (tal < -10 || tal > 10) {
            System.out.printf("Talet %d är mindre än 10 eller högre än 10\n", tal);
        }
    }



}
