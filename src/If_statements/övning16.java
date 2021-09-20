package If_statements;

import java.util.Scanner;

public class övning16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //16
        int antalEnheter = 0;
        double totalSumma = 0;
        double pris = 10;
        double rabatt = 0.9;

        System.out.println("Mata in antalet enheter: ");
        antalEnheter = scan.nextInt();

        totalSumma = antalEnheter * pris;

        if (totalSumma > 1000) {
            totalSumma = totalSumma * rabatt;
            System.out.println("Du ska betala: " + totalSumma);
        } else
            System.out.println("Du ska betala: " + totalSumma);
    }
}
