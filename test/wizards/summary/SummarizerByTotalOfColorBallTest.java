package wizards.summary;


import org.junit.Test;
import wizards.Balls;
import wizards.ball.Ball;
import wizards.ball.BallColor;

public class SummarizerByTotalOfColorBallTest {

    @Test
    public void summarizeShouldGiveASummaryOfGivenBallsAccordingToTheTotalOfColorBalls() {
        Balls balls = new Balls();
        balls.add(new Ball(BallColor.BLUE));
        balls.add(new Ball(BallColor.BLUE));
        balls.add(new Ball(BallColor.GREEN));
        balls.add(new Ball(BallColor.YELLOW));
        SummarizerByTotalOfColorBall summarizerByTotalOfColorBall = new SummarizerByTotalOfColorBall(balls);

    }
}