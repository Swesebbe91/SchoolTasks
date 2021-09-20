package Loops;

import java.util.Scanner;

public class Övning41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //41
        int tal = 1;
        int summa = 0;
        while (tal < 51) {
            summa += tal;
            tal++;
        }
        System.out.println("Summan av addition 1-50 är: " + summa);
    }
}
