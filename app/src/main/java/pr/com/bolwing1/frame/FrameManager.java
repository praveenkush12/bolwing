package pr.com.bolwing1.frame;

import java.util.ArrayList;

import pr.com.bolwing1.CompleteRoll;
import pr.com.bolwing1.ball.BallRoll;

public class FrameManager {

    private int remTurns = 10;
    public ArrayList<Frame> getFrames(ArrayList<BallRoll> rolls) {
        ArrayList<Frame> frames = new ArrayList<>();
        int roll = 0;
        while (roll < rolls.size()){
           // Get Turn and add to frames
        }
        return frames;
    }


    private Frame getTurn(ArrayList<BallRoll> rolls) {
        remTurns--;
        BallRoll firstRoll = new BallRoll(0);
        BallRoll secondRoll = new BallRoll(0);
//        if(strike)
//            return frame with 10 points and strike true
//        if(Spare)
//            return frame with 10 points and spare true

        return new Frame(firstRoll, secondRoll);
    }
    public int getRemTurns(){
        return remTurns;
    }

    public boolean isGameOver(){
        if(remTurns <= 0)
            return true;
        else
            return false;
    }

    public ArrayList<CompleteRoll> getCompFrmScores(ArrayList<BallRoll> rolls) {
        int roll = 0, score = 0;
        ArrayList<CompleteRoll>  compRoll = new ArrayList<CompleteRoll> ();

        while (roll < rolls.size()){
//            if(strike || Spare){
//                CompleteRoll croll = new CompleteRoll();
//                Add frame points to score and then add croll to compRoll
//
//            }

        }
        return compRoll;

    }

}
