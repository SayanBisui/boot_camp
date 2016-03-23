package wizards.summary;

import wizards.Balls;
import wizards.ball.BallColor;
import java.util.HashMap;

public class SummarizerByTotalOfColorBall implements Summarizer {

    private Balls balls;

    public SummarizerByTotalOfColorBall(Balls balls) {
        this.balls = balls;
    }

    private HashMap getColorBallsCounter(BallColor[] ballColors) {
        HashMap<BallColor,Integer> colorBallsCounter = new HashMap<>();
        for (int i = 0; i < ballColors.length; i++) {
            colorBallsCounter.put(ballColors[i],0);
        }
        return colorBallsCounter;
    }

    @Override
    public Summary summarize() {
        BallColor[] ballColors = BallColor.getAll();
        HashMap<BallColor, Integer> totalCountOfEachColorBall = new HashMap<>();

        for (int i = 0; i < ballColors.length; i++) {
            totalCountOfEachColorBall.put(ballColors[i],balls.getQuantityOf(ballColors[i]));
        }
        return new Summary(totalCountOfEachColorBall);
    }
}
