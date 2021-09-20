package If_statements;

import java.util.Scanner;

public class Övning19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //19
        int timLön = 0;
        int arbetsTid = 0;
        int övertid;
        double totLön = 0;

        System.out.println("Mata in timlön: ");
        timLön = scan.nextInt();

        System.out.println("Mata in arbetstiden: ");
        arbetsTid = scan.nextInt();

        if (arbetsTid > 40) {
            övertid = arbetsTid - 40;
            totLön = 40 * timLön + övertid * 1.5;
            System.out.printf("Din totala lön är: %s \n", totLön);
        } else {
            totLön = arbetsTid * timLön;
            System.out.printf("Din totala lön är: %s \n", totLön);
        }
    }
}
