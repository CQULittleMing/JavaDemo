package life;

import organ.MiddleWings;
import organ.Wing;

import java.awt.*;

public class Ostrich extends Bird {

    public Ostrich(Point point) {
        super(40, 180, point, new MiddleWings());
    }

    @Override
    boolean eat(float vol, Life a) {
        return false;
    }
}
