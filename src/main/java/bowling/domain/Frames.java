package bowling.domain;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Frames {

    private final List<Frame> frames;

    public Frames() {
        this.frames = initFrames();
    }

    private List<Frame> initFrames() {
        // TODO
        return new ArrayList<>();
    }

    public LastFrame current() {
        return null;
    }
}
