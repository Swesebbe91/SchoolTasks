package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Övning74 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        int vekt[] = new int[10];
        int i;
        int max = 0;
        int minst = 0;
        int tal = 10;

        vekt[0] = 0;
        vekt[0] = max;
        vekt[0] = minst;

        System.out.println("Leta upp största och minsta talet i vektorn");
        for(i = 1; i < vekt.length; i++) {
            vekt[i] = scan.nextInt();

            if (vekt[i] > max) {
                max = vekt[i];
            }
             if (vekt[i] < minst) {
                    minst = vekt[i];
                }
                System.out.println("Största talet just nu är " + max);
                System.out.println("Minsta talet just nu är " + minst);
            }
            System.out.println("Största talet blev: " + max);
            System.out.println("Minsta talet just nu är " + minst);

        }


    }

