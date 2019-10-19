package life;

import java.awt.*;

public class Tiger extends Mammal{
    public Tiger(Point point) {
        super(300, 170, point);
    }

    @Override
    boolean eat(float vol, Life a) {
        return false;
    }
}
