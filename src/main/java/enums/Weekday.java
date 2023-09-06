package enums;

public enum Weekday {
    MONDAY("Montag"),
    TUESDAY("Dienstag"),
    WEDNESDAY("Mittwoch"),
    THURSDAY("Donnerstag"),
    FRIDAY("Freitag"),
    SATURDAY("Samstag"),
    SUNDAY("Sonntag");

    private final String german;

    Weekday(String german) {
        this.german = german;
    }

    public String getGerman() {
        return german;
    }
}
