package length;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MathematicalOperatorTest {
    MathematicalOperator operator;
    @Before
    public void setUp() throws Exception {
        operator = new MathematicalOperator();

    }

    @Test
    public void compareLengthsShouldReturnTrueIfTwoLengthsAreEqualForDifferentUnits() throws Exception {
        Centimeter centimeter = new Centimeter(5);
        Inch inch = new Inch(2);
        assertTrue(operator.compareLengths(centimeter.convertToMillimeter(), inch.convertToMillimeter()));
    }

    @Test
    public void compareLengthsShouldReturnTrueIfTwoLengthsAreEqualForSameUnit() throws Exception {
        Centimeter firstLength = new Centimeter(5);
        Centimeter secondLength = new Centimeter(5);
        assertTrue(operator.compareLengths(firstLength.convertToMillimeter(), secondLength.convertToMillimeter()));
    }

    @Test
    public void compareLengthsShouldReturnFalseIfTwoLengthsAreNotEqual() throws Exception {
        Centimeter centimeter = new Centimeter(5);
        Inch inch = new Inch(2.5);
        assertFalse(operator.compareLengths(centimeter.convertToMillimeter(), inch.convertToMillimeter()));
    }

    @Test
    public void compareVolumesShouldReturnTrueIfTwoVolumesAreEqual() throws Exception {
        Liter liter = new Liter(3.78);
        Gallon gallon = new Gallon(1);
        assertTrue(operator.compareVolume(liter, gallon.convertToLiter()));
    }

    @Test
    public void compareVolumesShouldReturnFalseIfTwoVolumesAreNotEqual() throws Exception {
        Liter liter = new Liter(3.78);
        Gallon gallon = new Gallon(2);
        assertFalse(operator.compareVolume(liter, gallon.convertToLiter()));
    }

    @Test
    public void addLengthsShouldBeAbleToAddTwoLengthsOfSameUnit() throws Exception {
        Inch firstLength = new Inch(2);
        Inch secondLength = new Inch(2);
        Inch expectedLength = new Inch(4);
        Inch actualLength = operator.addLengths(firstLength.convertToMillimeter(), secondLength.convertToMillimeter());
        assertTrue(expectedLength.equals(actualLength));
    }

    @Test
    public void addLengthsShouldBeAbleToAddTwoLengthsOfDifferentUnitsAndReturnInInch() throws Exception {
        Inch firstLength = new Inch(2);
        Centimeter secondLength = new Centimeter(2.5);
        Inch expectedLength = new Inch(3);
        Inch actualLength = operator.addLengths(firstLength.convertToMillimeter(), secondLength.convertToMillimeter());
        assertEquals(expectedLength, actualLength);
    }
}