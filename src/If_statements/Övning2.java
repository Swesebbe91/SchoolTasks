package If_statements;
import java.util.Scanner;

public class Övning2 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

        //2.
        int grundlön = 8000;
        double prestationslön = 0.09d;
        double försäljningssumma = 0;
        double totLön = 0;

        System.out.println("Mata in försäljningssumman");
        försäljningssumma = scan.nextInt();
        försäljningssumma = försäljningssumma * prestationslön;
        totLön = försäljningssumma + grundlön;
        System.out.println("Din totala lön är: " + totLön);
    }
}
