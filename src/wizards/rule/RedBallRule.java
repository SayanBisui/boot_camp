package wizards.rule;


import wizards.Balls;
import wizards.ball.Ball;
import wizards.ball.BallColor;
import wizards.exception.RedBallLimitExceedException;

public class RedBallRule implements Rule {

    @Override
    public boolean checkIfBallCanBeAdded(Ball ball, Balls balls) throws RedBallLimitExceedException {
            if(ball.isOfSameColor(BallColor.RED)){
                int totalRedBalls = balls.getQuantityOf(BallColor.RED);
                int totalGreenBalls = balls.getQuantityOf(BallColor.GREEN);
                if(totalRedBalls < 2 * totalGreenBalls -1){
                    return true;
                }
                else{
                    throw new RedBallLimitExceedException("Red ball limit exceed");
                }
            }
        return false;
    }
}
