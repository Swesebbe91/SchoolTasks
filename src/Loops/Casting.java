package Loops;

import java.lang.reflect.Type;
import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* implicit - Sker automatiskt /*
         */
        int a = 15; /* Tillfällig omvandling */
        double b = 4;
        double c;
        c = (double) a / b;

        /* explicit (tvingande) */
        c = (double) a / b;

        /* Parsing (omvandla string till int) */

        System.out.println("Mata in sträng 0");
        // Omvandla sen ex int tal
        int tal;
        String s = scan.nextLine();
        tal = Integer.parseInt(s);
        System.out.println(tal);
        double d = Double.parseDouble(s);
        System.out.println(d);

        System.out.println();

        // Läs in 10 tal till en vektor;
        /*
        int vekt[] = new int[10];
        int index;
        for (index = 0; index < vekt.length; index++) {
            System.out.println("Mata in ett nytt tal: ");
            vekt[index] = scan.nextInt();
        }
        System.out.println(vekt[0]);
         */






}
}
