package If_statements;
import java.util.Scanner;

public class Övning4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //4.
        double tal1, tal2, tal3, summa, medelvärde;
        System.out.println("Mata in tal1: ");
        tal1 = scan.nextDouble();
        System.out.println("Mata in tal2: ");
        tal2 = scan.nextDouble();
        System.out.println("Mata in tal3: ");
        tal3 = scan.nextDouble();

        summa = tal1 + tal2 + tal3;
        medelvärde = summa / 3;
        System.out.printf("Medelvärdet av talen %.2f + %.2f + %.2f är = %.2f", tal1, tal2, tal3, medelvärde);
    }
}
