package wizards.rule;

import wizards.Ball;
import wizards.BallColor;
import wizards.BallLimit;
import wizards.Balls;

public class GreenBallRule implements Rule {

    @Override
    public boolean checkIfBallCanBeAdded(Ball ball, Balls balls) {
        if (balls.getQuantityOf(BallColor.GREEN) < BallLimit.GREEN.getLimit()){
            return true;
        }
        return false;
    }
}
