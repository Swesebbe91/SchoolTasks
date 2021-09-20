package Arrays;

import java.util.Scanner;

public class Övning75 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vect [] = new int[5];
        int negativaSum = 0;
        int positivaSum = 0;
        System.out.println("Mata in fem tal! ");
        for(int i = 0; i < vect.length; i++) {
            System.out.println("Mata in tal: " + (i + 1) + ": ");
            vect[i] = scan.nextInt();
        }
        for(int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                negativaSum +=vect[i];
            }
            else
                positivaSum += vect[i];
        }
        System.out.println("Summan av det positva talen är " + positivaSum);
        System.out.println("Summan av det negativa talen är " + negativaSum);
    }
}
