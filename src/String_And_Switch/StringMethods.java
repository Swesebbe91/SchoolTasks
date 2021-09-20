package String_And_Switch;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        //string
        String s = "HALLÅ!";
        System.out.println(s.charAt(0));

        //Loopa igenom sträng
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        for(int i = 0; i > s.length(); i--) {
            System.out.println(s.charAt(i));
        }

        // Equals & uppercase, se om strängar matchar
        String b = "hallå!".toUpperCase(Locale.ROOT);
        System.out.println(s.equals(b));

        //Trim (ta bort whitespace början & slutet)
        String whiteSpace = "       heeeeeeeeeeeeeeeeeee             ";
        System.out.println(whiteSpace.trim());

        //Contains (innehåller stringen...)
        System.out.println(b.contains("llå"));

        //Concat (a + b)
        String beskrivning = " Sebbe är bäst!";
        String nyMening = s.concat(beskrivning);
        System.out.println(nyMening);

        //Index of, se vilken plats någon bokstav/ord ligger på!
        System.out.println(beskrivning.indexOf("bä"));
        //Matchande string från index....
        System.out.println(beskrivning.indexOf("t!", 10));

        //Kollar om stringen startar med... boolean
        System.out.println(nyMening.startsWith("HAL"));

        //Replace (a mot b)
        nyMening = nyMening.replace("Sebbe är bäst!", "Du är inte bäst längre!");
        System.out.println(nyMening);

        //Diverse typ check .getClass.getSimpleName
        String a = "2";

        //Kolla string
        System.out.println(a.getClass().getSimpleName());





        int c = Integer.parseInt(a);
        //Kolla om det är en int
        System.out.println(((Object) c).getClass().getSimpleName());
    }
}
