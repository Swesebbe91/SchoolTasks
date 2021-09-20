package Arrays;

import java.util.Scanner;

public class Övning78 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] bråkVektor = new int[2];
        int t, n;
        boolean on = true;
        System.out.println("Mata in en täljare");
        bråkVektor[0] = scan.nextInt();

        System.out.println("Mata in en nämnare");
        n = scan.nextInt();

        while (n == 0) {
            System.out.println("Du får ej mata in 0 på täljare, välj ett nytt tal");
            n = scan.nextInt();
        }
        bråkVektor[1] = n;
        double kvot = (double) bråkVektor[0] / bråkVektor[1];

        System.out.printf("Du har valt att dela %d och %d som blir %.3f", bråkVektor[0], bråkVektor[1], kvot);

    }
}
