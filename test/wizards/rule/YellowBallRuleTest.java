package wizards.rule;

import org.junit.Test;
import wizards.Balls;
import wizards.ball.Ball;
import wizards.ball.BallColor;
import wizards.exception.YellowBallLimitExceedException;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;


public class YellowBallRuleTest {

    @Test
    public void checkIfBallCanBeAddedShouldGiveTrueWhenFortyPercentOfTotalBallsIsMoreThanOne() throws YellowBallLimitExceedException {
        Balls balls = new Balls();
        balls.add(new Ball(BallColor.BLUE));
        balls.add(new Ball(BallColor.BLUE));
        YellowBallRule yellowBallRule = new YellowBallRule(0.4);
        Ball yellowBall = new Ball(BallColor.YELLOW);
        assertTrue(yellowBallRule.checkIfBallCanBeAdded(yellowBall,balls));
    }

    @Test
    public void checkIfBallCanBeAddedShouldGiveFalseWhenYellowBallIsNotGivenToCheck() throws YellowBallLimitExceedException {
        Balls balls = new Balls();
        balls.add(new Ball(BallColor.GREEN));
        balls.add(new Ball(BallColor.BLUE));
        balls.add(new Ball(BallColor.BLUE));
        YellowBallRule blueBallRule = new YellowBallRule(3);
        Ball redBall = new Ball(BallColor.RED);
        assertFalse(blueBallRule.checkIfBallCanBeAdded(redBall,balls));
    }

    @Test(expected = YellowBallLimitExceedException.class)
    public void checkIfBallCanBeAddedShouldThrowExceptionWhenFortyPercentOfTotalBallsIsLessThanOne() throws YellowBallLimitExceedException {
        Balls balls = new Balls();
        balls.add(new Ball(BallColor.BLUE));
        YellowBallRule yellowBallRule = new YellowBallRule(0.4);
        Ball yellowBall = new Ball(BallColor.YELLOW);
        assertTrue(yellowBallRule.checkIfBallCanBeAdded(yellowBall,balls));
    }

}