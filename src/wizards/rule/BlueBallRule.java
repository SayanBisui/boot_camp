package wizards.rule;


import wizards.Balls;
import wizards.ball.Ball;
import wizards.ball.BallColor;
import wizards.exception.BlueBallLimitExceedException;

public class BlueBallRule implements Rule {

    private double threshold;

    public BlueBallRule(double threshold) {
        this.threshold = threshold;
    }

    @Override
    public boolean checkIfBallCanBeAdded(Ball ball, Balls balls) throws BlueBallLimitExceedException {
        if(ball.isOfSameColor(BallColor.BLUE)){
            if(balls.getQuantityOf(BallColor.BLUE) < threshold){
                return true;
            }
            throw new BlueBallLimitExceedException("Blue ball limit exceed");
        }
        return false;
    }
}
