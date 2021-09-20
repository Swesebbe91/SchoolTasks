package Arrays;

import java.util.Scanner;

public class Övning76 {

    public static void main(String[] args) {
        int vekt[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        int vekt2[] = new int[vekt.length];
        int index2 = vekt.length -1;

        for (int i = 0; i < vekt.length; i ++) {
            vekt2[index2] = vekt[i];
            index2--;
        }

        for(int i=0; i < vekt2.length; i ++){
            System.out.println(vekt2[i]);
        }

    }







}