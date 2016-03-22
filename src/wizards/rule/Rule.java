package wizards.rule;

import wizards.Ball;
import wizards.Balls;

public interface Rule {
    boolean checkIfBallCanBeAdded(Ball ball, Balls balls);
}
