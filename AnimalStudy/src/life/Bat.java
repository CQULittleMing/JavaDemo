package life;

import java.awt.*;

public class Bat extends Mammal implements Flyable {
    public Bat(Point point) {
        super(0.1f, 4, point);
        //setMovers();
    }

    @Override
    public void fly(int toX, int toY) {

    }

    @Override
    public int getLiftForce() {
        return 0;
    }

    @Override
    boolean eat(float vol, Life a) {
        return false;
    }
}
