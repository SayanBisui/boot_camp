package length;

public class Feet {
    private double measurement;

    protected Feet(double measurement) {

        this.measurement = measurement;
    };

    public Millimeter convertToMilimeter(){
        return new Millimeter(this.measurement*300);
    }
}
