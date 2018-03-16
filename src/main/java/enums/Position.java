package enums;

public enum Position {
    LEFTWING("Left Wing"),
    RIGHTWING("Right Wing"),
    CENTRE("Centre"),
    DEFENCEMAN("Defence"),
    GOALIE("Goalie");

    private String position;

    Position(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
}
