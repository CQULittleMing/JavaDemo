package life;

import environment.Environment;
import organ.MiddleWings;

import java.awt.*;

public class Swan extends Bird implements Swimable{

    public Swan(Point point) {
        super(2, 30, point, new MiddleWings());
    }

    @Override
    public int getLiftForce() {
        return getWings().getPower();
    }

    @Override
    public void move(int toX, int toY) {
        if (getEnvironment() == Environment.Water) {
            swim(toX, toY);
        } else {
            super.move(toX, toY);
        }
    }

    @Override
    public void swim(int toX, int toY) {

    }

    @Override
    boolean eat(float vol, Life life) {
        return false;
    }
}
