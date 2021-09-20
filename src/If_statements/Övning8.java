package If_statements;

import java.util.Scanner;

public class Övning8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //8.
        int bredden = 0;
        int långsidan = 0;
        int omkrets = 0;
        int area = 0;

        System.out.println("Mata in bredden: ");
        bredden = scan.nextInt();

        System.out.println("Mata in långsidan: ");
        långsidan = scan.nextInt();

        omkrets = bredden + bredden + långsidan + långsidan;
        area = bredden * långsidan;
        System.out.println("Bredd: " + bredden + " + bredd: " + bredden + " + långsidan: " + långsidan + " + långsidan: " + långsidan + " = omkretsen " + omkrets);
        System.out.println("Bredd " + bredden + " * långsidan: " + långsidan + " = arean " + area);
    }
}
