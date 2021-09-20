package Loops;

import java.util.Scanner;

public class Övning56 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double tal, summa =0;
        int stopp = 9999;
        int antalTal = 0;
        double medelvärde = 0;

        do {
            System.out.println("Mata in x antal tal!: Skriv \"9999\" för att avsluta");
            tal = scan.nextDouble();
            if (tal != stopp) {
                antalTal += 1;
                summa = summa + tal;
                medelvärde = summa/antalTal;

            }
        }

        while (tal != stopp);
    System.out.printf("Medeltalet av summan %.1f / %d = %.2f ", summa, antalTal, medelvärde);
    }
}
