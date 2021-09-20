package Arrays;

import java.util.Scanner;

public class Övning70 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vektor[] = new int[]{1, 2, 3, 4, 5};
        int summa = 0;

        System.out.println("Mata in 5 tal: ");
        for(int i = 0; i < vektor.length; i++ ) {
            System.out.println("Tal " + (i + 1) + ":");
            vektor[i] = scan.nextInt();
        }
        for(int i = 0; i < 5; i++)
            if (vektor[i] > 0)
            summa +=vektor[i];

        for(int i = 0; i < 5; i++)
            System.out.println(vektor[i]);
        System.out.println("Summan blev: " + summa);
    }
}
