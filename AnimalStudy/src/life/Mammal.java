package life;

import java.awt.*;

public abstract class Mammal extends Animal implements Walkable {

    public Mammal(float weight, float height, Point point) {
        super(weight, height, point);
    }

    @Override
    public void move(int toX, int toY) {
        walk(toX, toY);
    }

    @Override
    void breath() {
        System.out.println("mammal breath with lung");
    }

    @Override
    int procreate() {
        return 0;
    }

    @Override
    public void walk(int toX, int toY) {

    }
}
