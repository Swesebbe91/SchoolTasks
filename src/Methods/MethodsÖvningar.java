package Methods;

import java.util.Scanner;
import java.util.*;

public class MethodsÖvningar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1.
        System.out.println(number());

        //2.
        int num1, num2;
        num1 = number();
        num2 = number();
        int produkt = multiplikation(num1, num2);
        System.out.println("Tal 1: " + num1 + " * " + "tal 2 " + num2 + " = " + multiplikation(num1, num2));

        //3.
        helTal(produkt);

        //4.
        int[] vekt = new int[10];
        vektorInsamlare(vekt); //Vektor insamlingsmetod
        printVekt(vekt); //printa vektor metod "loopar igenom vektor"

        //5.
        int input;
        System.out.println("Mata in hur många tal du vill mata in");
        input = scan.nextInt();
        vekt = new int[input];
        vektorMedPositivaTal(vekt);

        //6.
        vekt = null;

        System.out.println("Mata in hur många tal du vill mata in");
        input = scan.nextInt();
        vekt = new int [input];

        System.out.println(summanAvVektorn(vekt));
        int sum[] = vekt;

        System.out.printf("Medelvärdet av vektorn är %.2f %n", medelvärdet(sum));

        //7.
        vekt = null;
        System.out.println("Skriv in hur många tal du vill skriva in: ");
        input = scan.nextInt();
        vekt = new int[input];
        allaTalIVektorn(vekt);

    }

    //Print vekt
    public static void printVekt(int vekt[]) {
        for (int i = 0; i < vekt.length; i++) {
            System.out.println(vekt[i]);
        }
    }
    //1.	Skapa en metod som läser in ett heltal och returnerar det.
    public static int number() {
        Scanner scan = new Scanner(System.in);
        int tal;
        System.out.println("Läs in ett tal: ");
        tal = scan.nextInt();
        return tal;
    }

    //2.	Skapa en metod som tar emot 2 heltal och multiplicerar dem med varandra.
    //Produkten ska returneras.
    public static int multiplikation(int tal1, int tal2) {
        int faktor = tal1 * tal2;
        return faktor;
    }

    // 3.	Skapa en metod som tar emot ett heltal och skriver ut det.
    public static void helTal(int tal) {
        System.out.println("Talet är: " + tal);
    }

    // 4. Skapa en vektormetod med 10 tal
    public static void vektorInsamlare(int v[]) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Läs in %d %n", v.length);
        for (int i = 0; i < v.length; i++) {
            System.out.println("Mata in tal " + (i + 1));
            v[i] = scan.nextInt();
        }

    }

    //5. Skapa en metod som tar reda på hur många heltal som är positiva. Vektorn som parameter till metoden

    public static void vektorMedPositivaTal(int vekt[]) {
        Scanner scan = new Scanner(System.in);
        int positiva = 0;
        for(int i = 0; i < vekt.length; i++) {
            System.out.println("Mata in ett tal " + (i + 1) + ":");
            vekt[i] = scan.nextInt();
            if (vekt[i] > 0) {
                positiva += 1;
            }
        }
        System.out.println("Antalet positiva tal är: " + positiva);

    }

    //6.
    public static int summanAvVektorn(int vekt[]) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i < vekt.length; i++) {
            System.out.println("Mata in ett tal " + (i + 1) + ":");
            vekt[i] = scan.nextInt();
                sum += vekt[i];
            }

        return sum;
    }
    //7. Skapa en metod som beräknar medelvärdet av talen i vektorn som skickas som parameter. Medelvärdet ska returneras.
    public static double medelvärdet(int []vekt) {
        int sum = 0;
        for (int i = 0; i < vekt.length; i++) {
            sum += vekt[i];

        }
        double medelvärde = (double)sum / vekt.length;
         return medelvärde;
    }

    //8	Skapa en metod som skriver ut samtliga tal i vektorn som skickas som parameter.
        public static void allaTalIVektorn(int[] vekt) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < vekt.length; i++) {
            System.out.println("Mata in tal " + (i + 1) + ": ");
            vekt[i] = scan.nextInt();

            }
            for (int i = 0; i < vekt.length; i++) {
                System.out.println("Tal " + (i + 1) + ": " + vekt[i]);
            }
        }
}
