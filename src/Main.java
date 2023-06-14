import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String text = "Hello world";
        System.out.println(text.length());

        System.out.println(text.isEmpty());
        String leer = "";
        System.out.println(leer.isEmpty());

        String leerzeiche = " ";
        System.out.println(leerzeiche.isEmpty());   //false
        System.out.println(leerzeiche.isBlank());   //true
        System.out.println("##########################");
        String keinObject = null;
        System.out.println(leerzeiche.isBlank());
        //System.out.println(keinObject.isEmpty()); // NullPointer

        String trim = " Hallo ";
        System.out.println("'" + trim + "' length: " + trim.length());
        System.out.println("'" + trim.trim() + "' length: " + trim.trim().length());

        String split = "Hallo zusammen, heute ist ein schöner Tag!";
        String[] gesplittet = split.split(",");
        System.out.println(Arrays.toString(gesplittet));
        System.out.println(gesplittet[0]);

        String[] gesplittet2 = split.split(" ");
        System.out.println(Arrays.toString(gesplittet2));

        System.out.println("Hallo Yuriy, dein Name ist Beck.");
        String firstname = "Yuriy";
        String lastname = "Beck";
        System.out.println("Hallo " + firstname + ", dein Name ist " + lastname + ".");

        String name = "Hallo %s, dein Name ist %s.".formatted(firstname, lastname);
        System.out.println(name);

        String welcomeMsg = "\nHallo %s, dein Name ist %s.\nHeute ist ein schöner Tag - %b.";
        boolean wether = true;
        String name2 = String.format(welcomeMsg, firstname, lastname, wether);
        System.out.println(name2);

        String name3 = String.format(welcomeMsg, "GROSS\n", lastname, wether);
        System.out.println(name3);

        welcomeMsg += "\nIch bin %d.";
        int age = 36;
        String name4 = String.format(welcomeMsg, firstname, lastname, wether, age);
        System.out.println(name4);

        // %d - decial
        // %f - float
        // %s - String
        // %b - boolean
        // %c - ascii chars

        //Find a character at
        System.out.println(lastname.charAt(0));
        System.out.println(lastname.charAt(lastname.length()-1));

        System.out.println(lastname.substring(1));
        System.out.println(lastname.substring(1,lastname.length()-1));

        String sonderzeichen = "schön";
        System.out.println(sonderzeichen.replace("ö", "oe"));
    }
}