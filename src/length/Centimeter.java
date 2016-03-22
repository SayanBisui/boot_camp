package length;

public class Centimeter implements Unit {
    private double measurement;

    public Centimeter(double measurement) {
        this.measurement = measurement;
    }


//    @Override
    public Millimeter convertToBaseUnit() {
        return new Millimeter(this.measurement*10);
    }
}