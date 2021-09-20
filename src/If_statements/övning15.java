package If_statements;

import java.util.Scanner;

public class övning15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //15
        int tal1 = 0;
        int tal2 = 0;

        System.out.println("Mata in ett tal");
        tal1 = scan.nextInt();

        System.out.println("Mata in ännu ett tal");
        tal2 = scan.nextInt();
        System.out.println("Nu ska vi se om " + tal1 + " är jämnt delbart med " + tal2);

        if (tal1 % tal2 == 0) {
            System.out.println("talet är delbart");
        } else
            System.out.println("Talet är inte delbart");
    }
}
