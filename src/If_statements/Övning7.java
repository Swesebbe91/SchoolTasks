package If_statements;

import java.util.Scanner;

public class Övning7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //7.
        int antalLiter = 0;
        double prisPerLiter = 0d;
        double rabatt = 0d;
        double summan = 0d;

        System.out.println("Mata in pris per liter: ");
        prisPerLiter = scan.nextDouble();

        System.out.println("Mata in antal liter: ");
        antalLiter = scan.nextInt();

        System.out.println("Mata in eventuell rabatt i %");
        rabatt = scan.nextInt();
        rabatt = rabatt / 100;

        summan = antalLiter * prisPerLiter;
        rabatt = summan * rabatt;
        summan = summan - rabatt;
        System.out.println("Summan du ska betala är: \n" +
                "liter bensin: " + antalLiter + "\n " +
                "Pris per liter: " + prisPerLiter + " \n" +
                "Rabatt: " + rabatt + "\n " + " = Du ska betala " + summan + "kr");
    }
}
