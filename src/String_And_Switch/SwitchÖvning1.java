package String_And_Switch;

import java.util.Scanner;

public class SwitchÖvning1 {
    public static void main(String[] args) {
        bankomat();
    }
    public static void bankomat() {
        Scanner scan = new Scanner(System.in);
        boolean on = true;
        while(on) {
            System.out.println("välkommen till bankomaten, var god och gör ett val \n" +

                    "[1] = Ta ut pengar \n"  +
                    "[2] = Sätt in pengar \n" +
                    "[3] = Visa saldo \n" +
                    "[4] = Avsluta! \n");
            System.out.println("Jag väljer meny val: ");

            int choise = scan.nextInt();

            switch (choise) {

                case 1:
                    System.out.println("Hur mycket pengar vill du ta ut?");
                    break;

                case 2:
                    System.out.println("Hur mycket pengar vill du sätta in?");
                    break;

                case 3:
                    System.out.println("Här visas ditt saldo!");
                    break;

                case 4:
                    System.out.println("Hejdå, Du har valt att avsluta programmet");
                    on = false;
                    break;

                default:
                    System.out.println("Du angav fel värde");
            }
        }

    }
}
