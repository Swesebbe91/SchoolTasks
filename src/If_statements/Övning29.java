package If_statements;

import java.util.Scanner;

public class Övning29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 29.
        int avgångsTidH = 0, avgångsTidM = 0, körTidH = 0, körTidM = 0;
        int ankomstTidH = 0, ankomstTidM = 0;
        System.out.println("Ange avgångstid i timmar: ");
        avgångsTidH = scan.nextInt();

        System.out.println("Ange avgångstid i minuter");
        avgångsTidM = scan.nextInt();

        System.out.println("Ange körtid i timmar");
        körTidH = scan.nextInt();

        System.out.println("Ange körtid i minuter");
        körTidM = scan.nextInt();

        ankomstTidH = avgångsTidH + körTidH;
        ankomstTidM = avgångsTidM + körTidM;

        if (ankomstTidM >= 60) {
            ankomstTidH += 1;
            ankomstTidM = ankomstTidM - 60;
        }
        if (ankomstTidH >= 24) {
            ankomstTidH = ankomstTidH - 24;

            if (ankomstTidH < 12) {
                System.out.printf("Ankomst tiden för tåget är: %02d:%d nästa dag \n", ankomstTidH, ankomstTidM);
            }
            if (ankomstTidM < 10) {
                System.out.printf("Ankomst tiden för tåget är: %02d:%02d nästa dag \n", ankomstTidH, ankomstTidM);
            } else {
                System.out.println("Ankomst tiden för tåget är: " + ankomstTidH + ":" + ankomstTidM + " nästa dag");
            }
        } else
            System.out.println("Ankomst tiden för tåget är: " + ankomstTidH + ":" + ankomstTidM);
    }
}
