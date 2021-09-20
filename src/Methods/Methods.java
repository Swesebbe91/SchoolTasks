package Methods;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int taljare = 15;
        double namnare = 4;
        double kvot;
        kvot = taljare / namnare;
        System.out.println(kvot);

        double faktor = 3.2;
        int faktor2 = 4;
        int produkt = faktor2 * (int)faktor;
        System.out.println(produkt);

        String s = "5";
        int tal = Integer.parseInt(s);
        System.out.println(((Object) tal).getClass().getSimpleName());

        s = Integer.toString(tal);
        System.out.println(s.getClass().getSimpleName());

        int antal = 0;
        antal++; antal = 4 * antal ;
        System.out.println(antal);

        welcome("Sebastian");
    welcome("Kalle");
        System.out.println(multiplikation(5, 10));
        int summa = multiplikation(5, 15);
        System.out.println(summa + 5);

        System.out.println(nameAndBirthday("Sebastian", 1991));

    }
    public static void welcome(String namn) {
        System.out.println("Hej " + namn + "!");

    }

    public static int multiplikation(int tal1, int tal2) {

        int summa = tal1 + tal2;
        return summa;
    }

    public static String nameAndBirthday(String namn, int birth) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ange din ålder: ");
        int age = scan.nextInt();
        birth = 2021 - age;

        return "Hej " + namn  + " du är född " + birth;
    }


}
