package length;

public class Feet implements Unit{
    private double measurement;

    protected Feet(double measurement) {
        this.measurement = measurement;
    }

    @Override
    public Millimeter convertToBaseUnit() {
        return new Millimeter(this.measurement*300);
    }
}
