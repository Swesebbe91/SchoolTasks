package Loops;

import java.util.Scanner;

public class Do_while {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*syntax
        Do/While

          do {

          } while (vilkor)
         */
        int tal;
        int kvadrat;
        do {
            System.out.println("Mata in ett tal mindre än 10");
            tal = scan.nextInt();
            kvadrat = tal * tal;


            if (tal < 10) {
                System.out.println(kvadrat);
            }
        }

        while (tal < 10); {
        }

    }
}
