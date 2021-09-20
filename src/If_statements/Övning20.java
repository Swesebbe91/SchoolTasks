package If_statements;

import java.util.Scanner;

public class Övning20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //20.
        int tal = 0;
        int kvadrat = 0;
        System.out.println("Mata in ett tal, om talet är mellan 0-9 skivs kvadraten ut");
        tal = scan.nextInt();

        if (tal >= 0 && tal <= 9) {
            kvadrat = tal * tal;
            System.out.printf("Kvadraten av tal: %s & tal: %s = %s \n", tal, tal, kvadrat);
        }
    }
}
