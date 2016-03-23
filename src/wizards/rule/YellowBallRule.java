package wizards.rule;

import wizards.Balls;
import wizards.ball.Ball;
import wizards.ball.BallColor;
import wizards.exception.YellowBallLimitExceedException;

public class YellowBallRule implements Rule {

    private double threshold;

    public YellowBallRule(double threshold) {
        this.threshold = threshold;
    }

    @Override
    public boolean checkIfBallCanBeAdded(Ball ball, Balls balls) throws YellowBallLimitExceedException {
        if(ball.isOfSameColor(BallColor.YELLOW)){
            if(((balls.size() + 1) * threshold) >= 1){
                return true;
            };
            throw new YellowBallLimitExceedException("limit of yellow balls exceed");
        }
        return false;
    }
}
