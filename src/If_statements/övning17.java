package If_statements;

import java.util.Scanner;

public class övning17 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //17
        int tal1 = 0;
        int tal2 = 0;
        System.out.println("Mata in ett tal: ");
        tal1 = scan.nextInt();

        System.out.println("Mata in ett tal2: ");
        tal2 = scan.nextInt();

        if (tal2 == 0) {
            System.out.println("fel meddelande");
        } else
            System.out.println(tal1 / tal2);
    }
}


