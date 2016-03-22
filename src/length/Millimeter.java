package length;

public class Millimeter implements Unit {
    private double measurement;

    public Millimeter(double measurement) {
        this.measurement = measurement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Millimeter that = (Millimeter) o;

        return Double.compare(that.measurement, measurement) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(measurement);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public Unit convertToBaseUnit() {
        return new Millimeter(this.measurement);
    }

    public double add(Millimeter secondLength) {
        return this.measurement + secondLength.measurement;
    }
}