package life;

import java.awt.*;

public abstract class Fish extends Animal implements Swimable{

    public Fish(float weight, float height, Point point) {
        super(weight, height, point);
    }

    @Override
    public void move(int toX, int toY) {
        swim(toX, toY);
    }

    @Override
    void breath() {
        System.out.println("fish breath with gill");
    }

    @Override
    int procreate() {
        return 0;
    }

    @Override
    public void swim(int toX, int toY) {

    }
}
