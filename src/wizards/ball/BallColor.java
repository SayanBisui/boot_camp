package wizards.ball;

public enum BallColor {
    BLUE("blue"),
    GREEN("green"),
    RED("red"),
    YELLOW("yellow");

    private final String color;

    BallColor(String color) {
        this.color = color;
    }

    public static BallColor[] getAll() {
        return BallColor.values();
    }

    public String getColor() {
        return color;
    }
}