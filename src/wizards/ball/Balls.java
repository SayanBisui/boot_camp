package wizards;

import wizards.ball.Ball;
import wizards.ball.BallColor;

import java.util.ArrayList;

public class Balls {
    private ArrayList<Ball> balls = new ArrayList<>();

    public boolean add(Ball ball) {
        return balls.add(ball);
    }

    public int size() {
        return balls.size();
    }

    public int getQuantityOf(BallColor ballColor) {
        int counter = 0;
        for (int i = 0; i < this.size(); i++) {
            if(balls.get(i).isOfSameColor(ballColor))
                counter++;
        }
        return counter;
    }
}
