package length;

public class Liter implements Unit {
    private double volume;

    public Liter(double volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Liter liter = (Liter) o;

        return Double.compare(liter.volume, volume) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(volume);
        return (int) (temp ^ (temp >>> 32));
    }


    @Override
    public Liter convertToBaseUnit() {
        return new Liter(this.volume);
    }
}