package If_statements;
import java.util.Scanner;

public class Övning1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1.
        int kvadrat = 0, tal = 0;
        System.out.println("Mata in ett tal så skriver vi ut kvadraten på det!");
        tal = scan.nextInt();
        kvadrat = tal * tal;
        System.out.println("Kvadraten av talet " + tal + " * " + tal + " = " + kvadrat);
    }
}
