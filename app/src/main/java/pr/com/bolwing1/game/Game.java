package pr.com.bolwing1.game;

import java.util.ArrayList;
import java.util.Collection;

import pr.com.bolwing1.frame.Frame;

public class Game {
    public static final int NUMBER_OF_FRAMES = 10;

    private ArrayList<Frame> frames;

    public Game(ArrayList<Frame> frames) {
        this.frames = frames;
    }

    public Collection<Frame> frames() {
        return frames.subList(0, NUMBER_OF_FRAMES);
    }

    public Frame next(Frame frame) {
        int turn = frames.indexOf(frame);
        return frames.get(turn + 1);
    }
}
