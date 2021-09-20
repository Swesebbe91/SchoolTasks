package Loops;

import java.util.Scanner;

public class Övning60 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input1, input2;
        int likaTal = 0;

        System.out.println("Läs in ett antal tal, avsluta med 0");
        input1 = scan.nextInt();
        while(input1 != 0) {
            System.out.println("Läs in ett nytt tal, avsluta programmet med 0");
            input2 = scan.nextInt();
            if (input1 == input2) {
                likaTal +=1;
            }
            input1 = input2;
        }
        System.out.println("Antalet lika tal: " + likaTal);
    }
}
