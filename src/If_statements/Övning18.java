package If_statements;

import java.util.Scanner;

public class Övning18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 18.
        int x, y, a;

        System.out.println("Mata in siffran \"X\":");
        x = scan.nextInt();

        System.out.println("Mata in siffran \"Y\":");
        y = scan.nextInt();

       a = (x > y + 5)? 2:5;
        System.out.println(a);
    }
}
