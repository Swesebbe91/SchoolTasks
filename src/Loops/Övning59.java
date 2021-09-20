package Loops;

import java.util.Scanner;

public class Övning59 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int talföljd = 1;
        int störst = 0;
        int lägst = 0;
        int tal1;
        System.out.println("Skriv in 10 tal så kollar vi vilket som är störst");

        System.out.println("Skriv in ditt första tal: " + talföljd);
        tal1 = scan.nextInt();
        while (talföljd < 10) {

            if (tal1 > störst) {
                störst = tal1;
            }

            if (tal1 < lägst) {
                lägst = tal1;
            }
            System.out.println("Skriv in tal: " + (talföljd + 1));
            tal1 = scan.nextInt();
            talföljd += 1;
        }

        System.out.println("Största talet var: " + störst);
        System.out.println("Minsta talet var: " + lägst);
    }
}
