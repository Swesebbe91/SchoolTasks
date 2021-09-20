package Arrays;

import java.util.Scanner;

public class TestVector {
    public static void main(String[] args) {

        int antal = 2;
        int produkt = (4 * 2) * ++antal;
        System.out.println(produkt);

        int n = 5;
        for(int i = 1; i <= n; ++i) {
            System.out.println(i);
        }

        int[] vektor1 = new int[10];
        int[] vektorTest = new int[10];
        arrayMethod(vektor1);
        //arrayLoop(vektor1);
        //int sum = (sumCounter(2, 5));
        //System.out.println(difference(sum));
        //int[] vektor2 = new int[10];
        //arrayBackwards(vektor2);
        vektorTest = Omskrivaren(vektor1, vektorTest);
        arrayLoop(vektorTest);
    }

    public static void arrayMethod (int a[]) {
        Scanner scan = new Scanner(System.in);
        int i = 0;

        System.out.println("Mata in 10 siffror till en vektor");
        for(i = 0; i < a.length; i++) {
            System.out.printf("Mata in vektor %d : ", a[i]);
            a[i] = scan.nextInt();
        }
    }
    public static void arrayLoop(int a[]) {
        for(int i = 0; i < a.length; i++) {
            System.out.printf("Vektor: %s ", a[i]);
        }
    }

    public static int sumCounter(int tal1, int tal2) {
        int sum = tal1 + tal2;
        return sum;
    }

    public static int difference(int tal1) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mata in ett tal: ");
        int tal2 = scan.nextInt();

        int sum =  tal2 - tal1;
        return sum;


    }

    public static void arrayBackwards(int[] a) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mata in 10 vektor så hittar vi den negativa");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println("Mata in vektor: ");
            a[i] = scan.nextInt();

            if (a[i] < 0) {
                System.out.printf("Talet är negativt på vektorplats index %d%n", i);
                i = 0;
            }

        }
    }
        public static int[] Omskrivaren(int[]a, int[]b) {
            Scanner scan = new Scanner(System.in);
            int indexUp = 0;
            int indexDown = b.length -1;


            for (indexUp = 0; indexUp < a.length; indexUp++, indexDown--) {
                b[indexDown] = a[indexUp];
            }
            return b;
        }



    }


