package Loops;

import java.util.Scanner;

public class Övning36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 36.
        int insats = 1000;
        float ränta = 0.10f, räntebäring = 0;
        int år = 1;
        float tot = 0;

        while (år <= 10) {
            tot = tot + insats;
            räntebäring = tot * ränta;
            tot = räntebäring + tot;
            System.out.println("År " + år + " : " + tot);
            år = år + 1;
        }
    }
}
