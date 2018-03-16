package enums;

public enum Availability {
    AVAILABILE("Available"),
    DAYTODAY("Day to Day"),
    UPPERBODY("IR - UBI"),
    LOWERBODY("IR - LBI"),
    CONCUSSION("IR - Concussion"),
    OUT("Out");

    private String available;

    Availability(String available) {
        this.available = available;
    }

    public String getAvailable() {
        return available;
    }
}
