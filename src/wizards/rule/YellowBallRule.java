package wizards.rule;

import wizards.Ball;
import wizards.BallLimit;
import wizards.Balls;

public class YellowBallRule implements Rule {

    @Override
    public boolean checkIfBallCanBeAdded(Ball ball, Balls balls) {
        for (int i = 0; i < balls.size(); i++) {
            return (balls.size() + 1 * BallLimit.YELLOW.getLimit()) >= 1;
        }
        return true;
    }
}
