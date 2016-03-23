package wizards.rule;


import wizards.Balls;
import wizards.ball.Ball;
import wizards.exception.BlueBallLimitExceedException;
import wizards.exception.GreenBallLimitExceedException;
import wizards.exception.RedBallLimitExceedException;
import wizards.exception.YellowBallLimitExceedException;

public interface Rule {
    boolean checkIfBallCanBeAdded(Ball ball, Balls balls) throws GreenBallLimitExceedException, YellowBallLimitExceedException, RedBallLimitExceedException, BlueBallLimitExceedException;
}
