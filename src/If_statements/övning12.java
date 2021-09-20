package If_statements;

import java.util.Scanner;

public class övning12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //12
        int tal1 = 0;
        int tal2 = 0;

        System.out.println("Mata in ett tal: ");
        tal1 = scan.nextInt();
        System.out.println("Mata in ett nytt tal: ");
        tal2 = scan.nextInt();

        if (tal1 / 2 > tal2) {
            System.out.println("För stort");
        }
    }
}
