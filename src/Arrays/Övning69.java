package Arrays;

import java.util.Scanner;

public class Övning69 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int vekt[] = new int[10];

        for(int i = 0; i < vekt.length; i++) {
            System.out.println("Mata in tal " + (i + 1 + ":"));
            vekt[i] = scan.nextInt();

            if(vekt[i] % 2 != 0) {
                vekt[i] += 2;
            }
        }
        System.out.println(vekt[0]);
        System.out.println(vekt[2]);
    }
}
