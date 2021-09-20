package Loops;

import java.util.Scanner;

public class Övning63 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input, input2;
        System.out.println("Ange ett tal: ");
        input = scan.nextInt();
        while (input != 0) {
            System.out.println("Ange ett nytt tal: ");
            input2 = scan.nextInt();
            if (input2 <= input) {
                if(input2 != 0)
                System.out.println("Fel sorteringsordning");
                else {
                    input = input2;
                }
            }
            else {
                input = input2;
            }
        }
    }
}
