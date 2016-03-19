package chance;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class ChanceTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void createShouldThrowExceptionWhenInvaildArgumentIsGiven() throws Exception, InvalidChanceValueException {
        thrown.expect(InvalidChanceValueException.class);
        thrown.expectMessage("Value should be from 0 to 1");
        Chance chance = Chance.create(1.5);
    }

    @Test
    public void andShouldMultiplyTheValueOfTwoChances() throws Exception, InvalidChanceValueException {
        Chance chance = Chance.create(0.5);
        Chance anotherChance = Chance.create(0.5);
        assertEquals(0.25, chance.and(anotherChance), 0);
    }

    @Test
    public void notShouldNegateTheValueOfChance() throws Exception, InvalidChanceValueException {
        Chance chance = Chance.create(0.75);
        assertEquals(0.25, chance.not(), 0);
    }
}