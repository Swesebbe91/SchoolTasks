package Loops;

import java.util.Scanner;

public class Övning47 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //47
        int produkt = 0;

        for(int tal = 1; tal < 15; tal++) {
            if (tal % 2 != 0) {
                produkt = tal * tal;
                System.out.println(produkt);
            }

        }

    }
}
