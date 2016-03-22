package length;

public class MathematicalOperator implements AddUnit{

    public boolean compareTwoUnit(Unit firstUnit, Unit secondUnit){
        return firstUnit.convertToBaseUnit().equals(secondUnit.convertToBaseUnit());

    }

//    @Override
//    public Inch addLengths(Millimeter firstLength, Millimeter secondLength){
//        return new Inch(firstLength.convertToBaseUnit().add(secondLength.convertToBaseUnit())/25);
//    }

    @Override
    public double addLengths() {
        return 0;
    }
}
