package Arrays;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int vektorEtt [] = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int vektorTvå [] = new int[vektorEtt.length];

        int index = vektorEtt.length - 1;

        for (int i = 0; i < vektorEtt.length; i++, index--) {
            vektorTvå[index] = vektorEtt[i];

        }
        for(int i = 0; i < vektorTvå.length; i++) {
            System.out.println(vektorTvå[i]);
        }

        int[] test = new int[] {1, 2, 3};
        for(int i: test) {
            System.out.println(i);
        }
    }
}
