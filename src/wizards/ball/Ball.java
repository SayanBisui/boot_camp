
package wizards.ball;
/*
    Job of Ball
    - to tell the color of ball and max balls.
 */


public class Ball {
    private BallColor ballColor;

    public Ball(BallColor ballColor) {
        this.ballColor = ballColor;
    }

    public boolean isOfSameColor(BallColor otherBallColor) {
        return ballColor.equals(otherBallColor);
    }
}