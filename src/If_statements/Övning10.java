package If_statements;
import java.util.Scanner;

public class Övning10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //10
        double celcius = 0;
        double farenheit = 0;
        System.out.println("Mata in grader i farenheit");
        farenheit = scan.nextDouble();

        celcius = 5 * (farenheit - 32) / 9;
        System.out.printf("%.2f farenheit är %.2f celcius\n", farenheit, celcius);
    }
}
