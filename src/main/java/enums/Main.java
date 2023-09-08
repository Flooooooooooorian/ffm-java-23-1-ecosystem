package enums;

public class Main {

    public static void main(String[] args) {
        Appointment a1 = new Appointment("1", "Java Bootcamp", Weekday.TUESDAY);
        System.out.println(a1);
        System.out.println(a1.wochentag());

        if (a1.wochentag() == Weekday.SUNDAY) {
            System.out.println("Termin ist am Sonntag");
        }
        else {
            System.out.println("Termin ist nicht am Sonntag");
        }

        System.out.println(a1.wochentag().getGerman());
        System.out.println("Test");
    }
}
