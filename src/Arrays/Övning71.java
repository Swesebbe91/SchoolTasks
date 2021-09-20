package Arrays;

import java.util.Scanner;
import java.util.Random;
public class Övning71 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random rnd = new Random();
        int tal = 100;

        int vekt[] = new int[5];
        int sum = 0;
        for(int i = 0; i < vekt.length; i++) {
            vekt[i] = rnd.nextInt(tal);
            if (vekt[i] > vekt[0]) {
                sum+=1;
            }

        }
        System.out.println("Antalet större tal är " + sum);



    }
}
