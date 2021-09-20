package Arrays;

import java.util.Scanner;

public class Övning77 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int vect[] = new int[10];

        System.out.println("Mata in 10 tal!");
        for(int i = 0; i < vect.length; i++) {
            System.out.println("Mata in tal: " + (i + 1));
            vect[i] = scan.nextInt();
        }
        for(int i = vect.length -1; i >= 0; i--) {
            System.out.println(vect[i]);
        }

        int antal = 1;

        while(antal < 11) {
            System.out.printf("Mata in ett negativt tal %d: %n", antal);
            int tal = scan.nextInt();
            if (tal < 0) {
                antal +=1;
            }
            else
                System.out.println("Tyvärr ett negativt tal");

        }






    }
}
