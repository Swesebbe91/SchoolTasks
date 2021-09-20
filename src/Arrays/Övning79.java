package Arrays;

import String_And_Switch.Switch;

import java.util.Scanner;

public class Övning79 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vektor = new int[2];

        int t, n;
        double sum;
        System.out.println("Mata in en täljare");
        t = scan.nextInt();

        while (t < 0) {
            System.out.println("Du får ej ange en negativ täljare, skriv [0] om du vill ange ett nytt tal\n " +
                    "valfri siffra om du vill omvandla ditt redan inmatade tal till positivt");

            int input = scan.nextInt();
            switch (input) {
                case 0:
                    while (t < 0) {
                        System.out.println("Ange ett positivt tal");
                        t = scan.nextInt();
                        if (t < 0)
                            System.out.println("Talet är negativt, vilket är förbjudet!");

                    }
                    break;
                default:
                    t = t * -1;
            }


        }

        vektor[0] = t;
        System.out.printf("Du har matat in täljare: %d%n", t);

        System.out.println("Mata in en nämnare");
        n = scan.nextInt();

        while (n == 0) {
            System.out.println("Du får ej mata in 0 på täljare, välj ett nytt tal");
            n = scan.nextInt();
        }
        vektor[1] = n;
        System.out.printf("Du har matat in nämnaren %d%n", n);

        for (int i = 0; i < vektor.length; i++) {
            System.out.println("Vektorn består av tal: " + vektor[i] + " tal: " + vektor[i + 1]);
            i = 1;
        }
        sum = (double) t / n;
        System.out.printf("Kvoten av %d och %d är: %.2f", t, n, sum);
    }
}
