package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Övning73 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int tal = 10;
        int sum = 0;
        int vekt[] = new int[10];

        for(int i = 0; i < vekt.length; i++) {
            vekt[i] = rnd.nextInt(tal);
            System.out.println(vekt[i]);
        }
        for(int i = 0; i < vekt.length; i++) {
            sum+=vekt[i];
            System.out.println("Summan är nu: " + sum);
        }
        int medelvärde = sum/ vekt.length;
        System.out.println("Summan är " + sum);
        System.out.println("Medelvärdet är " + sum + " / " + vekt.length + " = " + medelvärde);

    }
}
