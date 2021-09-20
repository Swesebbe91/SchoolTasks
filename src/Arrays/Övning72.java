package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Övning72 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int vekt[] = new int[10];

        System.out.println("Mata in 50 tal");
        for (int i = 9; i >= 0; i--) {
            vekt[i] = rnd.nextInt();

            if (vekt[i] < 0) {
                System.out.println("här är jag negativ, index nummer: " + i + " talet är " +  vekt[i]);
                i = 0;
            }
        }
    }
}