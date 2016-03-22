package wizards.rule;

import wizards.Ball;
import wizards.BallColor;
import wizards.Balls;

public class RedBallRule implements Rule {

    @Override
    public boolean checkIfBallCanBeAdded(Ball ball, Balls balls) {
        for (int i = 0; i < balls.size(); i++) {
            if(ball.isOfSameColor(BallColor.RED)){
                int totalRedBalls = balls.getQuantityOf(BallColor.RED);
                int totalGreenBalls = balls.getQuantityOf(BallColor.GREEN);
                return totalRedBalls < 2 * totalGreenBalls;
            }
        }
        return true;
    }
}
