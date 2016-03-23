package wizards.rule;

import org.junit.Test;
import wizards.Balls;
import wizards.ball.Ball;
import wizards.ball.BallColor;
import wizards.exception.BlueBallLimitExceedException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BlueBallRuleTest {

    @Test
    public void checkIfBallCanBeAddedShouldGiveTrueWhenTotalBlueBallsAreLessThanTheThresholdLimit() throws BlueBallLimitExceedException {
        Balls balls = new Balls();
        balls.add(new Ball(BallColor.BLUE));
        balls.add(new Ball(BallColor.GREEN));
        BlueBallRule blueBallRule = new BlueBallRule(4);
        Ball blueBall = new Ball(BallColor.BLUE);
        assertTrue(blueBallRule.checkIfBallCanBeAdded(blueBall,balls));
    }

    @Test
    public void checkIfBallCanBeAddedShouldGiveFalseWhenBlueBallIsNotGivenToCheck() throws BlueBallLimitExceedException {
        Balls balls = new Balls();
        balls.add(new Ball(BallColor.BLUE));
        balls.add(new Ball(BallColor.BLUE));
        BlueBallRule blueBallRule = new BlueBallRule(4);
        Ball yellowBall = new Ball(BallColor.YELLOW);
        assertFalse(blueBallRule.checkIfBallCanBeAdded(yellowBall,balls));
    }

    @Test(expected = BlueBallLimitExceedException.class)
    public void checkIfBallCanBeAddedShouldThrowExceptionWhenTotalBlueBallsAreEqualToTheThresholdLimit() throws BlueBallLimitExceedException {
        Balls balls = new Balls();
        balls.add(new Ball(BallColor.BLUE));
        balls.add(new Ball(BallColor.BLUE));
        balls.add(new Ball(BallColor.BLUE));
        BlueBallRule blueBallRule = new BlueBallRule(3);
        Ball blueBall = new Ball(BallColor.BLUE);
        blueBallRule.checkIfBallCanBeAdded(blueBall,balls);
    }
}