package Loops;

import java.util.Scanner;

public class Övning31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 31.
        int input;
        System.out.println("Mata in ett tal, skriv 0 för att avsluta!");
        input = scan.nextInt();
        while (input != 0) {
            System.out.println("mata in ett tal, skriv 0 för att avsluta!");
            input = scan.nextInt();
        }
        System.out.println("Du har nu avslutat loopen");
    }
}
