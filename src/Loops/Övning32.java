package Loops;

import java.util.Scanner;

public class Övning32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 32.
        int tal = 2;
        while (tal < 100) {
            System.out.println(tal);
            tal = tal + 2;
        }
    }
}