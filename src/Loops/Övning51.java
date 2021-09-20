package Loops;

import java.util.Scanner;

public class Övning51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int x = 1;
        int tal;
        int antalGånger = 0;
        System.out.println("Läs in 100 tal ");

        System.out.println("Läs in ett tal, tal " + (x) + ":");
        tal = scan.nextInt();

        while (x < 10) {
            if (tal == 7) {
                antalGånger += 1;
            }
            System.out.println("Läs in ett nytt tal, tal:" + (x + 1) + ":");
            tal = scan.nextInt();

            x++;
        }
        if (tal == 7) {
            antalGånger += 1;
            System.out.println(antalGånger);
        }

    }
}
