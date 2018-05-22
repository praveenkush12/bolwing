package pr.com.bolwing1.game;

import java.util.ArrayList;

import pr.com.bolwing1.frame.Frame;

public class GameScorer {
    private Game game;
    private ArrayList<Frame> frames = new ArrayList<>();
    public GameScorer() {
        this.game = new Game(frames);
    }

    public int score() {
        int result = 0;
        for (Frame frame : game.frames()) {
      //Calculate and add the scores to result
       //This is will include the calculation of spare and strike points
        }
        return result;

    }

    private int spareScore(Frame frame) {
        int score = 0;
//        if (Spare) {
//            //Get next frame and add first ball score
//        }

        return score;

    }

    private int strikeScore(Frame frame) {
        int score = 0;
//        if (Strike) {
//            //Get next frame and add first ball and 2nd ball score
//        }
        return score;
    }

}
