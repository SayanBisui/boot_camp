package wizards;

public enum BallColor {
    BLUE("blue"),
    GREEN("green"),
    RED("red"),
    YELLOW("yellow");

    private final String color;

    BallColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}