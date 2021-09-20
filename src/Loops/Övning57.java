package Loops;

import java.util.Scanner;

public class Övning57 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double liter = 0;
        int kördaMil;
        int sumMil = 0;
        double totLiter = 0;
        double bensinFörbrukningPerMil = 0;

        do {
            System.out.println("Mata in antalet liter, avsluta med 0!: ");
            liter = scan.nextInt();

            if (liter != 0) {
                System.out.println("Mata in antalet körda mil: ");
                kördaMil = scan.nextInt();

                System.out.println("förbrukning denna tankningen " + liter/kördaMil);
                totLiter = totLiter + liter;
                sumMil += kördaMil;

            }

        }

        while(liter != 0);

        if (totLiter != 0) {
        bensinFörbrukningPerMil = totLiter / sumMil;
        System.out.printf("Bensinförbrukningen per mil = %.1f", bensinFörbrukningPerMil);
        }
    }
}
