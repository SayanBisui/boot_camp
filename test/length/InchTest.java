package length;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class InchTest {

    @Test
    public void convertToMilimetershouldConvertIntoMillimeter() throws Exception {
        Inch inch = new Inch(1);
        Millimeter expected = new Millimeter(25);
        assertEquals(expected, inch.convertToMillimeter());
    }
}