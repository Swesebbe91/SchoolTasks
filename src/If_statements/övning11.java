package If_statements;

import java.util.Scanner;

public class övning11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //11
        int tal1 = 0;
        int tal2 = 0;

        System.out.println("Mata in tal 1: ");
        tal1 = scan.nextInt();
        System.out.println("Mata in tal 2: ");
        tal2 = scan.nextInt();

        if (tal1 > tal2) {
            System.out.println("Talet " + tal1 + " är större");
        }
    }
}
