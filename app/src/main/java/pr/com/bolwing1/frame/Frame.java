package pr.com.bolwing1.frame;

import pr.com.bolwing1.ball.BallRoll;

public class Frame {
    private BallRoll firstRoll;
    private BallRoll secondRoll;
    private boolean isSpare = false;
    private boolean isStrike = false;



    protected Frame(BallRoll roll) {
        this(roll, new BallRoll(0));
    }

    public Frame(BallRoll firstRoll, BallRoll secondRoll) {
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
    }

    public int numberOfKnockedPins() {
        return firstRoll.numberOfKnockedPins() + secondRoll.numberOfKnockedPins();
    }

    public int numberOfPinsKnockedInFirstRoll() {
        return firstRoll.numberOfKnockedPins();
    }

    public boolean isStrike() {
        if (firstRoll.numberOfKnockedPins() == 10) {
            isStrike = true;
            return isStrike;
        } else {
            return false;
        }
    }

    public boolean isSpare() {
        if (firstRoll.numberOfKnockedPins() + secondRoll.numberOfKnockedPins() == 10) {
            isSpare = true;
            return isSpare;
        } else {
            return false;
        }
    }

}
