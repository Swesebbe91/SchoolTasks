package Loops;

import java.util.Scanner;

public class Övning40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //40. TITTA UPP FACIT

        int x = -10;
        int sum;
        while (x < 11) {
            sum = (3 * x * x * x) - (5 * x * x) + (2 * x) - 20;

            if (x >= -10 && x <= 10) {
                System.out.println(sum);
            }
            x++;
        }
    }
}
