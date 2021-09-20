package Arrays;

import java.util.Scanner;

public class Övning68 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int vekt[] = new int[]{1, 10, 20, 35, 40, 50};
        for (int i = 0; i < vekt.length; i++) {

            vekt[i] = vekt[i] * 2;
        }
        System.out.println(vekt[5]);
    }
}