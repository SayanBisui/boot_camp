package length;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CentimeterTest {
    @Test
    public void convertToMillimetershouldConvertIntoMillimeter() throws Exception {
        Centimeter centimeter = new Centimeter(1);
        Millimeter expected = new Millimeter(10);
        assertEquals(expected, centimeter.convertToMillimeter());
    }
}