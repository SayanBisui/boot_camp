package length;

public class Inch {
    private double measurement;

    protected Inch(double measurement) {
        this.measurement = measurement;
    }

    public Millimeter convertToMillimeter(){
        return new Millimeter(this.measurement*25);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Inch inch = (Inch) o;

        return Double.compare(inch.measurement, measurement) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(measurement);
        return (int) (temp ^ (temp >>> 32));
    }
}