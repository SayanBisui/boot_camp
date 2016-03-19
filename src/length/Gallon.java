package length;

public class Gallon {
    private double volume;

    public Gallon(double volume) {
        this.volume = volume;
    }

    public Liter convertToLiter(){
        return new Liter(this.volume * 3.78);
    }
}
