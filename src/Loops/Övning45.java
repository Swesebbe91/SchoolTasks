package Loops;

import java.util.Scanner;

public class Övning45 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //45
        int summa = 0;
        int antalGånger = 0;
        int tal;
        System.out.println("skriv in ett tal så ser vi hur många gånger det behöver adderas för att bli större än 100 000");
        tal = scan.nextInt();
        while (summa < 100000) {
            summa = summa + tal;
            antalGånger = antalGånger + 1;
        }
        System.out.println(antalGånger);
    }
}
