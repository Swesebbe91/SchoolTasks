package If_statements;

import java.util.Scanner;

public class Övning23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //23.
        int tal = 0;
        System.out.println("Läs in ännu ett tal, ej 30");
        tal = scan.nextInt();
        if (tal % 3 == 0 && tal % 30 != 0) {
            System.out.println(tal / 3);
        } else {
            System.out.println("Tal inte delbart med 3 / eller så är talet 30");
        }
    }
}
