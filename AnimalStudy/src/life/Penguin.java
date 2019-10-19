package life;

import organ.MiddleWings;

import java.awt.*;

public class Penguin extends Bird{
    public Penguin(Point point) {
        super(10, 60, point, new MiddleWings());
    }

    @Override
    boolean eat(float vol, Life life) {
        return false;
    }
}
