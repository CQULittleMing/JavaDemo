package life;

import java.awt.*;

public class Shark extends Fish {

    public Shark(Point point) {
        super(2000, 300, point);
    }

    @Override
    boolean eat(float vol, Life life) {
        return false;
    }
}
