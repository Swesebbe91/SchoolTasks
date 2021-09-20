package If_statements;

import java.util.Scanner;

public class Övning9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //9
        double radie;
        double diameter;
        double omkretsen = 0;
        double arean = 0;

        System.out.println("Mata in radie: ");
        radie = scan.nextDouble();
        diameter = radie * radie;
        omkretsen = diameter * 3.14;
        arean = radie * radie * 3.14;
        System.out.println("Diametern på cirkeln är: " + diameter);
        System.out.println("Omkretsen på cirkeln är " + omkretsen);
        System.out.println("Arean på cirkeln är " + arean);
    }
}
