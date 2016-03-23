package wizards.bag;
/*
    Job of Bag
    - to put ball in bag.
    - validate whether ball given is allowed to put or not.
 */

import wizards.Balls;
import wizards.ball.Ball;
import wizards.exception.*;
import wizards.rule.Rule;
import wizards.rule.Rules;

public class Bag {
    private Balls balls;
    private Rules rules;

    private final int maxSize;

    public Bag(int maxSize, Rules rules) {
        this.rules = rules;
        this.balls = new Balls();
        this.maxSize = maxSize;
    }


    public boolean put(Ball magicalBall) throws BagFullException, YellowBallLimitExceedException, GreenBallLimitExceedException, RedBallLimitExceedException, BlueBallLimitExceedException {
        if(isFull()){
            throw new BagFullException("Bag max limit exceed");
        }
        else{
            for (Rule rule : rules) {
                if(rule.checkIfBallCanBeAdded(magicalBall, balls)){
                    return balls.add(magicalBall);
                };
            }
            throw new BagFullException("Bag max limit exceed");
        }
    }

    private boolean isFull() {
        return balls.size() >= maxSize;
    }
}