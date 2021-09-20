package Loops;

import java.util.Scanner;

public class Övning46 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //46.
        double lön = 0.01;
        int antalDagar = 0;
        double sum = 0;

        while(sum < 1000000) {
            lön = lön * 2;
            sum += lön;
            antalDagar +=1;
        }
        System.out.println("Antelet dagar som behövs är: " + antalDagar);
    }
}
