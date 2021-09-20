package Loops;

import java.util.Scanner;

public class Övning50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int produkt;


        for(int x = 1; x < 10; x++) {
            System.out.printf("Dags för %d:ans tabell%n%n", x);

            for (int y = 1; y < 10; y++) {
                produkt = x * y;
                System.out.printf("Tal %d * Tal %d = %d%n", x, y, produkt);
            }


        }
    }
}

