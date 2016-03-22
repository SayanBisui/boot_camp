package wizards.rule;

import wizards.Ball;
import wizards.BallColor;
import wizards.BallLimit;
import wizards.Balls;

public class BlueBallRule implements Rule {
    @Override
    public boolean checkIfBallCanBeAdded(Ball ball, Balls balls) {
        if(balls.getQuantityOf(BallColor.BLUE) < BallLimit.BLUE.getLimit()){
            return true;
        };
        return false;
    }
}
