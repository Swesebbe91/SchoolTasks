package String_And_Switch;

import java.util.Locale;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        betyg();
    }

    public static void betyg() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Mata in ett betyg mellan MVG, VG, G, IG");
        String betyg = scan.nextLine().toLowerCase(Locale.ROOT);

        switch (betyg) {

            case "mvg":
                System.out.println("Grattis du får betyg: " + betyg);
                break;

            case "vg":
                System.out.println("Grattis du får betyg:" + betyg);
                break;

            case "g":
                System.out.println("Grattis du får betyg: " + betyg);
                break;

            case "ig":
                System.out.println("Tyvärr du har fått betyget: " + betyg);
                break;

            default:
                System.out.println("Inget betyg har angets");
        }

    }
}
