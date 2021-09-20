package Loops;

import java.util.Scanner;

public class Övning55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int förstaTal, nyttTal;
        int summaStörreTal = 0;
        int summaLägreTal = 0;
        int x = 1;
        System.out.println("Mata in 101 tal, vi skriver ut summan som är större än första talet och summan av de tal som är mindre");
        System.out.println("mata in tal: " + x);
        förstaTal = scan.nextInt();
        while (x < 101) {

            System.out.println("Mata in tal " + (x + 1));
            nyttTal = scan.nextInt();

            if (nyttTal > förstaTal) {
                summaStörreTal = summaStörreTal + nyttTal;
            } else
                summaLägreTal = summaLägreTal + nyttTal;
            x++;
        }

        System.out.println("Summa1: " + summaLägreTal);
        System.out.println("Summa2: " + summaStörreTal);
    }
}
