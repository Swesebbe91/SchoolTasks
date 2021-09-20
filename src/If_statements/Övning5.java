package If_statements;

import java.util.Scanner;

public class Övning5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //5.
        int kronor;
        double dollar = 6;
        int pund = 10;

        System.out.println("Mata in antalet kronor du vill växla");
        kronor = scan.nextInt();

        dollar = kronor / dollar;
        pund = kronor / pund;

        System.out.println("Om jag växlar " + kronor + "kr" + " får jag " + dollar + " i dollar & " + pund + " i pund");
    }
}
