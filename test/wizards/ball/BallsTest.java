package wizards.ball;

import org.junit.Test;
import wizards.Balls;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BallsTest {

    @Test
    public void addShouldAddABallWhenCorrectBallIsGiven() {
        Balls balls = new Balls();
        Ball blueBall = new Ball(BallColor.BLUE);
        assertTrue(balls.add(blueBall));
    }

    @Test
    public void sizeShouldGiveTheTotalNumberOfBallsPresentAdded() {
        Balls balls = new Balls();
        balls.add(new Ball(BallColor.BLUE));
        balls.add(new Ball(BallColor.GREEN));
        assertEquals(balls.size(),2);
    }

    @Test
    public void getQuantityOfShouldGiveTheTotalNumberOfSpecificColorBalls() {
        Balls balls = new Balls();
        balls.add(new Ball(BallColor.BLUE));
        balls.add(new Ball(BallColor.BLUE));
        balls.add(new Ball(BallColor.GREEN));
        assertEquals(balls.getQuantityOf(BallColor.BLUE),2);
    }

}