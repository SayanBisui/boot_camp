package length;

public class Gallon implements Unit {
    private double volume;

    public Gallon(double volume) {
        this.volume = volume;
    }
    @Override

    public Liter convertToBaseUnit(){

        return new Liter(this.volume * 3.78);
    }
}
