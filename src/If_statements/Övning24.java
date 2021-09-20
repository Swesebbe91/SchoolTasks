package If_statements;

import java.util.Scanner;

public class Övning24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //24.
        int KT;
        System.out.println("Mata in din kroppstemperatur");
        KT = scan.nextInt();
        if (KT < 35 || KT > 42) {
            System.out.println("Din kropps temperatur är onormal, gå till doktorn");
        } else
            System.out.println("Din kroppstemperatur ser normal ut");
    }
}
