package wizards.rule;


import wizards.Balls;
import wizards.ball.Ball;
import wizards.ball.BallColor;
import wizards.exception.GreenBallLimitExceedException;

public class GreenBallRule implements Rule {

    private double threshold;

    public GreenBallRule(double threshold) {
        this.threshold = threshold;
    }

    @Override
    public boolean checkIfBallCanBeAdded(Ball ball, Balls balls) throws GreenBallLimitExceedException {
        if(ball.isOfSameColor(BallColor.GREEN)){
            if (balls.getQuantityOf(BallColor.GREEN) < threshold){
                return true;
            }
            throw new GreenBallLimitExceedException("Green ball limit exceed");
        }
        return false;
    }


}
