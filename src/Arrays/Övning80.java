package Arrays;

import java.util.Scanner;

public class Övning80 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] bråkvektor = new int[2];

        int a, b;
        int c = 0;
        double sum;
        System.out.println("Mata in en täljare");
        a = scan.nextInt();

        while (a < 0) {
            System.out.println("Du får ej ange en negativ täljare, skriv [0] om du vill ange ett nytt tal\n " +
                    "valfri siffra om du vill omvandla ditt redan inmatade tal till positivt");

            int input = scan.nextInt();
            switch (input) {
                case 0:
                    while (a < 0) {
                        System.out.println("Ange ett positivt tal");
                        a = scan.nextInt();
                        if (a < 0)
                            System.out.println("Talet är negativt, vilket är förbjudet!");

                    }
                    break;
                default:
                    a = a * -1;
            }


        }

        bråkvektor[0] = a;
        System.out.printf("Du har matat in täljare: %d%n", a);

        System.out.println("Mata in en nämnare");
        b = scan.nextInt();

        while (b == 0) {
            System.out.println("Du får ej mata in 0 på täljare, välj ett nytt tal");
            b = scan.nextInt();
        }

        }
    }

