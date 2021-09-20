package If_statements;
import java.util.Scanner;

public class Övning3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //3.
        int timmar, minuter, sekunder;
        System.out.println("Mata in timmar så omvandlar vi till minuter: ");
        timmar = scan.nextInt();
        minuter = timmar * 60;
        sekunder = minuter * 60;
        System.out.println("Antalet timmar: " + timmar + " Antelet minuter är: " + minuter + " antalet sekunder är: " + sekunder);

    }
}
