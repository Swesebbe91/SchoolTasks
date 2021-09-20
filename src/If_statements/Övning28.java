package If_statements;

import java.util.Scanner;

public class Övning28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 28.
        int temp = 0;

        System.out.println("Mata in en temperatur");
        temp = scan.nextInt();

        if (temp >= 18 && temp <= 25) {
            System.out.println("Lagom temp");
        } else {
            if (temp > 25) {
                System.out.println("För varmt");
            } else
                System.out.println("För kallt");
        }
    }
}
