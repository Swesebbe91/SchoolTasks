package If_statements;

import java.util.Scanner;

public class Övning6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //6.
        int a, x;
        int summa = 0;
        System.out.println("Mata in ett tal (a)");
        a = scan.nextInt();

        System.out.println("Mata in (x) ");
        x = scan.nextInt();

        summa = a * x * x * x + 7;
        System.out.println("Summan är " + summa);
    }
}
