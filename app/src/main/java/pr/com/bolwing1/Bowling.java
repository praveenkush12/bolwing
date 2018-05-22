package pr.com.bolwing1;
import java.util.ArrayList;

import pr.com.bolwing1.CompleteRoll;
import pr.com.bolwing1.Scores;
import pr.com.bolwing1.ball.BallRoll;
import pr.com.bolwing1.frame.FrameManager;
import pr.com.bolwing1.game.GameScorer;

public class Bowling implements Scores {

    private final FrameManager frameMgr;
    private final GameScorer gameScr;


    public Bowling() {
        this.frameMgr = new FrameManager();
        this.gameScr = new GameScorer();
    }

    @Override
    public int frameNumber() {
       return frameMgr.getRemTurns();
    }

    @Override
    public int scoreSoFar(Object rolls) {
       return gameScr.score();
    }

    @Override
    public boolean gameIsOver() {
      return  frameMgr.isGameOver();
    }

    @Override
    public ArrayList<CompleteRoll> roll(ArrayList<BallRoll> rolls) {

        return frameMgr.getCompFrmScores(rolls);
    }
}

