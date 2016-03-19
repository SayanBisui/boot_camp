package length;

public class Centimeter {
    private double measurement;

    public Centimeter(double measurement) {
        this.measurement = measurement;
    }

   public Millimeter convertToMillimeter(){
       return new Millimeter(this.measurement*10);
   }
}