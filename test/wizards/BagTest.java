package wizards;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BagTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void putShouldAddABallIntoTheBag() throws RuleViolationException {
        Bag bag = new Bag(12);
        assertTrue(bag.put(new Ball(BallColor.GREEN)));
    }

    @Test
    public void putShouldNotAllowMoreThanThreeGreenBalls() throws RuleViolationException {
        Bag bag = new Bag(12);
        bag.put(new Ball(BallColor.GREEN));
        bag.put(new Ball(BallColor.GREEN));
        bag.put(new Ball(BallColor.GREEN));

        thrown.expect(RuleViolationException.class);
        thrown.expectMessage("Balloria has exploded");
        bag.put(new Ball(BallColor.GREEN));
    }

    @Test
    public void putShouldAllowRedBallUntilQuantityOfRedBallsIsLessThanTheDoubleOfGreenBalls() throws RuleViolationException {
        Bag bag = new Bag(12);
        bag.put(new Ball(BallColor.GREEN));
        bag.put(new Ball(BallColor.GREEN));
        assertTrue(bag.put(new Ball(BallColor.RED)));
        bag.put(new Ball(BallColor.RED));
        bag.put(new Ball(BallColor.RED));

        thrown.expect(RuleViolationException.class);
        thrown.expectMessage("Balloria has exploded");
        bag.put(new Ball(BallColor.RED));
    }

    @Test
    public void putShouldNotAllowRedBallWhenThereIsNoGreenBallInsideTheBag() throws RuleViolationException {
        Bag bag = new Bag(12);

        thrown.expect(RuleViolationException.class);
        thrown.expectMessage("Balloria has exploded");
        bag.put(new Ball(BallColor.RED));
    }

    @Test
    public void putShouldBeAbleToPutBlueBallsAsMuchAsTheSizeOfBag() throws RuleViolationException {
        Bag bag = new Bag(12);
        bag.put(new Ball(BallColor.BLUE));
        bag.put(new Ball(BallColor.BLUE));
        bag.put(new Ball(BallColor.BLUE));
        bag.put(new Ball(BallColor.BLUE));
        bag.put(new Ball(BallColor.BLUE));
        bag.put(new Ball(BallColor.BLUE));
        bag.put(new Ball(BallColor.BLUE));
        bag.put(new Ball(BallColor.BLUE));
        bag.put(new Ball(BallColor.BLUE));
        bag.put(new Ball(BallColor.BLUE));
        bag.put(new Ball(BallColor.BLUE));
        assertTrue(bag.put(new Ball(BallColor.BLUE)));

        thrown.expect(RuleViolationException.class);
        thrown.expectMessage("Balloria has exploded");
        bag.put(new Ball(BallColor.BLUE));
    }

    @Test
    public void putShouldAllowYellowBallsToBeOnlyFortyPercentOfTotalBalls() throws RuleViolationException {
        Bag bag = new Bag(12);
        bag.put(new Ball(BallColor.BLUE));
        thrown.expect(RuleViolationException.class);
        thrown.expectMessage("Balloria has exploded");
        bag.put(new Ball(BallColor.YELLOW));
    }

    @Test
    public void getSummaryByColorOfBallsShouldGiveARepresentationOfAccordingToColorWhenNoBallIsAdded() {
        Bag bag = new Bag(12);
        assertEquals("Bag : 0 Balls\n", bag.getSummaryByColorOfBalls());
    }

    @Test
    public void getSummaryByColorOfBallsShouldGiveARepresentationOfBallsAccordingToColorWhenSomeBallsArePresentInBag() throws RuleViolationException {
        Bag bag = new Bag(12);
        bag.put(new Ball(BallColor.BLUE));
        bag.put(new Ball(BallColor.BLUE));
        bag.put(new Ball(BallColor.GREEN));
        String expectedRepresentation = "Bag : 3 Balls\n"+"green : 1\n"+"blue : 2\n";
        assertEquals(expectedRepresentation, bag.getSummaryByColorOfBalls());
    }

    @Test
    public void getSummaryByOrderOfPlacementShouldGiveARepresentationOfBallsAccordingToOrderOfPutting() throws RuleViolationException {
        Bag bag = new Bag(12);
        bag.put(new Ball(BallColor.BLUE));
        bag.put(new Ball(BallColor.BLUE));
        bag.put(new Ball(BallColor.GREEN));
        String expectedRepresentation = "Bag : 3 balls\n"+"2B, 1G";
        assertEquals(expectedRepresentation, bag.getSummaryByOrderOfPlacement());
    }
}