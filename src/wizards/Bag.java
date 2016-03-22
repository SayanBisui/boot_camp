
package wizards;
/*
    Job of Bag
    - to put ball in bag.
    - validate whether ball given is allowed to put or not.
 */

import wizards.rule.Rules;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class Bag {
    private Balls balls;
    private Rules rules;

    private final int maxSize;

    public Bag(int maxSize, Rules rules) {
        this.rules = rules;
        this.balls = new Balls();
        this.maxSize = maxSize;
    }

//    private int getSizeOf (BallColor ballColor) {
//        if(bag.containsKey(ballColor.getColor())){
//            return bag.get(ballColor.getColor()).size();
//        }
//        return 0;
//    }

//    private boolean isRedBallsLessThanDoubleOfGreenBalls () {
//        int totalRedBalls = getSizeOf(BallColor.RED);
//        int totalGreenBalls = getSizeOf(BallColor.GREEN);
//        return 2*totalGreenBalls-1 > totalRedBalls;
//    }

//    private boolean isYellowBallsLessThanFortyPercentOfTotalBalls() {
//        return Math.floor((sizeOfBag+1)*40/100) > getSizeOf(BallColor.YELLOW);
//    }
//
//    private boolean checkYellowBallRule(Ball magicBall) {
//        return magicBall.isOfSameColor(BallColor.YELLOW.getColor()) && !isYellowBallsLessThanFortyPercentOfTotalBalls();
//    }
//
//    private boolean checkRedBallRule(Ball magicBall) {
//        return  magicBall.isOfSameColor(BallColor.RED.getColor()) && !isRedBallsLessThanDoubleOfGreenBalls();
//    }
//
//    private boolean isValidBallToPut(Ball magicBall) {
//        if(checkYellowBallRule(magicBall) || checkRedBallRule(magicBall)) return false;
//
////        if(bag.containsKey(magicBall.getColor())) {
////            ArrayList<Ball> balls = bag.get(magicBall.getColor());
////            if((balls.size() >= magicBall.maxLengthOfBall())) return false;
////        }
//        return true;
//    }


    public boolean put(Ball magicalBall) throws RuleViolationException {
        if(isFull()){
            throw new RuleViolationException("haha");
        }
        else{

        }
//        if(sizeOfBag < maxSize && isValidBallToPut(magicalBall)){
//            if(!bag.containsKey(magicalBall.getColor())) {
//                bag.put(magicalBall.getColor(), new ArrayList<>());
//            }
//            ArrayList<Ball> balls = bag.get(magicalBall.getColor());
//            sizeOfBag++;
//            trackOfBalls.add(magicalBall);
//            return balls.add(magicalBall);
//        }
//        throw new RuleViolationException("Balloria has exploded");
    }

    private boolean isFull() {
        return balls.size() >= maxSize;
    }

//    public String getSummaryByColorOfBalls() {
//        Iterator<Map.Entry<String, ArrayList<Ball>>> iterator = bag.entrySet().iterator();
//        StringBuilder summary = new StringBuilder();
//        summary.append("Bag : ").append(sizeOfBag).append(" Balls").append("\n");
//        while (iterator.hasNext()){
//            Map.Entry<String, ArrayList<Ball>> next = iterator.next();
//            summary.append(next.getKey()).append(" : ").append(bag.get(next.getKey()).size()).append("\n");
//        }
//        System.out.println(bag);
//        return summary.toString();
//    }

//    public String getSummaryByOrderOfPlacement() {
//        String currentBall = trackOfBalls.get(0).getColor();
//        int ballColorCounter = 0;
//        for (int i = 0; i < trackOfBalls.size(); i++) {
//            Ball ball = trackOfBalls.get(i);
//            if(ball.getColor().equals(currentBall)){
//                ballColorCounter++;
//            }
//        }
//        return "";
//    }
}