package Loops;

import java.util.Scanner;

public class Övning43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //43
        int tal = 2;
        int sum = 0;
        for(tal = 2; tal < 31; tal++) {
            if (tal % 2 == 0) {
                sum += tal;
            }
        }
        System.out.println(sum);
    }
}
