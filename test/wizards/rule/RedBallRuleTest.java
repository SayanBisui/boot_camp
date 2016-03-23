package wizards.rule;

import org.junit.Test;
import wizards.Balls;
import wizards.ball.Ball;
import wizards.ball.BallColor;
import wizards.exception.RedBallLimitExceedException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RedBallRuleTest {

    @Test
    public void checkIfBallCanBeAddedShouldGiveTrueWhenTotalRedBallsAreLessThanTheDoubleOfGreenBalls() throws RedBallLimitExceedException {
        Balls balls = new Balls();
        balls.add(new Ball(BallColor.GREEN));
        RedBallRule redBallRule = new RedBallRule();
        Ball redBall = new Ball(BallColor.RED);
        assertTrue(redBallRule.checkIfBallCanBeAdded(redBall,balls));
    }

    @Test
    public void checkIfBallCanBeAddedShouldGiveFalseWhenRedBallIsNotGivenToCheck() throws RedBallLimitExceedException {
        Balls balls = new Balls();
        balls.add(new Ball(BallColor.BLUE));
        balls.add(new Ball(BallColor.BLUE));
        RedBallRule redBallRule = new RedBallRule();
        Ball yellowBall = new Ball(BallColor.YELLOW);
        assertFalse(redBallRule.checkIfBallCanBeAdded(yellowBall,balls));
    }

    @Test(expected = RedBallLimitExceedException.class)
    public void checkIfBallCanBeAddedShouldThrowExceptionWhenTotalRedBallsAreEqualOrMoreThanTheDoubleOfGreenBalls() throws RedBallLimitExceedException {
        Balls balls = new Balls();
        balls.add(new Ball(BallColor.GREEN));
        balls.add(new Ball(BallColor.RED));
        RedBallRule redBallRule = new RedBallRule();
        Ball redBall = new Ball(BallColor.RED);
        redBallRule.checkIfBallCanBeAdded(redBall,balls);
    }
}