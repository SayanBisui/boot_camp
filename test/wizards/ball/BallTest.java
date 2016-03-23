package wizards.ball;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BallTest {

    @Test
    public void isOfSameColorShouldGiveTrueWhenColorAreSame() {
        Ball redBall = new Ball(BallColor.RED);
        assertTrue(redBall.isOfSameColor(BallColor.RED));
    }

    @Test
    public void isOfSameColorShouldGiveFalseWhenColorAreDifferent() {
        Ball redBall = new Ball(BallColor.RED);
        assertFalse(redBall.isOfSameColor(BallColor.GREEN));
    }


}