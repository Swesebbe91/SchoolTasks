package Loops;

import java.util.Scanner;

public class Övning39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //39
        int pris;
        double moms = 1.25d;
        double totalpris = 0;
        double totalSumma = 0;

        do {
            System.out.println("Mata in ett pris, skriv 0 för att avsluta!: ");
            pris = scan.nextInt();
            totalpris = pris * moms;

            if (pris != 0) {
                System.out.println(totalpris);
                totalSumma = totalSumma + totalpris;
            }
        }
        while (pris != 0);
        {

        }
        System.out.println("Du ska betala: " + totalSumma);
    }
}
