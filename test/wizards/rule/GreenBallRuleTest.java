package wizards.rule;

import org.junit.Test;
import wizards.Balls;
import wizards.ball.Ball;
import wizards.ball.BallColor;
import wizards.exception.GreenBallLimitExceedException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class GreenBallRuleTest {

    @Test
    public void checkIfBallCanBeAddedShouldGiveTrueWhenTotalGreenBallsAreLessThanTheThresholdLimit() throws GreenBallLimitExceedException {
        Balls balls = new Balls();
        balls.add(new Ball(BallColor.GREEN));
        GreenBallRule greenBallRule = new GreenBallRule(3);
        Ball redBall = new Ball(BallColor.GREEN);
        assertTrue(greenBallRule.checkIfBallCanBeAdded(redBall,balls));
    }

    @Test
    public void checkIfBallCanBeAddedShouldGiveFalseWhenGreenBallIsNotGivenToCheck() throws GreenBallLimitExceedException {
        Balls balls = new Balls();
        balls.add(new Ball(BallColor.BLUE));
        balls.add(new Ball(BallColor.GREEN));
        GreenBallRule redBallRule = new GreenBallRule(3);
        Ball blueBall = new Ball(BallColor.BLUE);
        assertFalse(redBallRule.checkIfBallCanBeAdded(blueBall,balls));
    }

    @Test(expected = GreenBallLimitExceedException.class)
    public void checkIfBallCanBeAddedShouldThrowExceptionWhenTotalGreenBallsAreEqualOrMoreThanTheThresholdLimit() throws GreenBallLimitExceedException {
        Balls balls = new Balls();
        balls.add(new Ball(BallColor.GREEN));
        balls.add(new Ball(BallColor.GREEN));
        balls.add(new Ball(BallColor.GREEN));
        GreenBallRule redBallRule = new GreenBallRule(3);
        Ball greenBall = new Ball(BallColor.GREEN);
        redBallRule.checkIfBallCanBeAdded(greenBall,balls);
    }

}