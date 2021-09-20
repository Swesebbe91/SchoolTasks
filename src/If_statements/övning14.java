package If_statements;

import java.util.Scanner;

public class övning14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //14
        int tal1 = 0;
        int summa = 0;
        System.out.println("Mata in ett tal");
        tal1 = scan.nextInt();
        summa = tal1 % 2;

        if (summa == 0) {
            System.out.println("Talet " + tal1 + " är jämnt");
        } else
            System.out.println("Talet " + tal1 + " är ojämnt");
    }
}
