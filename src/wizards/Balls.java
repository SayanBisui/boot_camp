package wizards;

import java.util.ArrayList;

public class Balls extends ArrayList<Ball> {

    public boolean add(Ball ball) {
        return this.add(ball);
    }

    public int size() {
        return this.size();
    }

    public int getQuantityOf(BallColor ballColor) {
        int counter;
        for (int i = 0; i < this.size(); i++) {
            if(this.get(i).isOfSameColor(ballColor.getColor()))
                counter++;
        }
    }
}
