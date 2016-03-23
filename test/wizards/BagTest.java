package wizards;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import wizards.bag.Bag;
import wizards.ball.Ball;
import wizards.ball.BallColor;
import wizards.exception.*;
import wizards.rule.*;

import static org.junit.Assert.assertTrue;

public class BagTest {
    Rules rules;
    public int MAX_SIZE_OF_BAG;

    @Before
    public void setUp() throws Exception {
        rules = new Rules();
        MAX_SIZE_OF_BAG = 12;
        rules.add(new YellowBallRule(0.4));
        rules.add(new RedBallRule());
        rules.add(new BlueBallRule(MAX_SIZE_OF_BAG));
        rules.add(new GreenBallRule(3));
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void putShouldAddABallIntoTheBag() throws BagFullException, YellowBallLimitExceedException, GreenBallLimitExceedException, RedBallLimitExceedException, BlueBallLimitExceedException {
        Bag bag = new Bag(MAX_SIZE_OF_BAG,rules);
        assertTrue(bag.put(new Ball(BallColor.GREEN)));
    }

    @Test(expected = GreenBallLimitExceedException.class)
    public void putShouldNotPutMoreThanThreeGreenBalls() throws BagFullException, YellowBallLimitExceedException, GreenBallLimitExceedException, RedBallLimitExceedException, BlueBallLimitExceedException {
        Bag bag = new Bag(MAX_SIZE_OF_BAG,rules);
        bag.put(new Ball(BallColor.GREEN));
        bag.put(new Ball(BallColor.GREEN));
        bag.put(new Ball(BallColor.GREEN));

        bag.put(new Ball(BallColor.GREEN));
    }

    @Test(expected = RedBallLimitExceedException.class)
    public void putShouldAllowRedBallUntilQuantityOfRedBallsIsLessThanTheDoubleOfGreenBalls() throws BagFullException, YellowBallLimitExceedException, GreenBallLimitExceedException, RedBallLimitExceedException, BlueBallLimitExceedException {
        Bag bag = new Bag(MAX_SIZE_OF_BAG,rules);
        bag.put(new Ball(BallColor.GREEN));
        bag.put(new Ball(BallColor.GREEN));
        bag.put(new Ball(BallColor.RED));
        bag.put(new Ball(BallColor.RED));
        assertTrue(bag.put(new Ball(BallColor.RED)));

        bag.put(new Ball(BallColor.RED));
    }

    @Test(expected = RedBallLimitExceedException.class)
    public void putShouldNotAllowRedBallWhenThereIsNoGreenBallInsideTheBag() throws BagFullException, YellowBallLimitExceedException, GreenBallLimitExceedException, RedBallLimitExceedException, BlueBallLimitExceedException {
        Bag bag = new Bag(MAX_SIZE_OF_BAG,rules);

        bag.put(new Ball(BallColor.RED));
    }

    @Test(expected = BagFullException.class)
    public void putShouldBeAbleToPutBlueBallsAsMuchAsTheSizeOfBag() throws BlueBallLimitExceedException, GreenBallLimitExceedException, YellowBallLimitExceedException, RedBallLimitExceedException, BagFullException {
        int sizeofBag = 4;
        Bag bag = new Bag(sizeofBag,rules);
        bag.put(new Ball(BallColor.BLUE));
        bag.put(new Ball(BallColor.BLUE));
        bag.put(new Ball(BallColor.BLUE));
        assertTrue(bag.put(new Ball(BallColor.BLUE)));

        bag.put(new Ball(BallColor.BLUE));
    }

    @Test(expected = YellowBallLimitExceedException.class)
    public void putShouldPutMaxFortyPercentYellowBallsOfTotalBallsInTheBag() throws BlueBallLimitExceedException, GreenBallLimitExceedException, YellowBallLimitExceedException, RedBallLimitExceedException, BagFullException {
        Bag bag = new Bag(MAX_SIZE_OF_BAG,rules);
        bag.put(new Ball(BallColor.BLUE));

        bag.put(new Ball(BallColor.YELLOW));
    }
}