package life;

import java.awt.*;

public class Whale extends Mammal implements Swimable {

    public Whale(Point point) {
        super(150000, 800, point);
    }

    @Override
    boolean eat(float vol, Life a) {
        return false;
    }

    @Override
    public void swim(int toX, int toY) {

    }
}
