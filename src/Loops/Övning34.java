package Loops;

import java.util.Scanner;

public class Övning34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //34.
        String input = "";
        char tecken;

        System.out.println("Skriv in ett tecken, avsluta med * ");
        input = scan.nextLine();
        tecken = input.charAt(0);

        while (tecken != '*') {
            System.out.println("Mata in ett nytt tecken (avsluta programmet med *)");
            input = scan.nextLine();
            tecken = input.charAt(0);

        }
    }
}
