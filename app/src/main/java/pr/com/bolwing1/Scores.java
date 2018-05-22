package pr.com.bolwing1;

import java.util.ArrayList;

import pr.com.bolwing1.ball.BallRoll;

public interface Scores {
    int frameNumber();
    int scoreSoFar(Object rolls);
    boolean gameIsOver();
    ArrayList<CompleteRoll> roll(ArrayList<BallRoll> rolls);
}
