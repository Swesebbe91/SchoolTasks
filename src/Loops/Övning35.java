package Loops;

import java.util.Scanner;

public class Övning35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 35.
        int tal = 1;
        int kvadrat = 0;
        while (tal < 10) {
            kvadrat = tal * tal;
            System.out.println("Kvadraten av tal: " + tal + " * tal: " + tal + " = " + kvadrat);
            tal++;
        }
    }
}
