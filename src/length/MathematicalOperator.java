package length;

public class MathematicalOperator {

   public boolean compareLengths(Millimeter firstLength, Millimeter secondLength){
       return firstLength.equals(secondLength);
   }

    public boolean compareVolume(Liter firstVolume, Liter secondVolume) {
        return firstVolume.equals(secondVolume);
    }

    public Inch addLengths(Millimeter firstLength, Millimeter secondLength){
        return new Inch(firstLength.add(secondLength)/25);
    }
}
