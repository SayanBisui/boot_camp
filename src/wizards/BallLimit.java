package wizards;

public enum BallLimit {
    GREEN(3),
    YELLOW(0.4),
    BLUE(12),
    RED(5);

    private double limit;

    BallLimit(double limit) {
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }
}
