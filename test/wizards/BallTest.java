package wizards;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BallTest {

    @Test
    public void ofColorShouldGiveTheColorOfABall() {
        Ball greenBall = new Ball(BallColor.GREEN);
        assertEquals("green", greenBall.getColor());
    }
}