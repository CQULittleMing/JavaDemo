package life;


import environment.Environment;
import organ.Foot;
import organ.Wing;

import java.awt.*;

abstract class Bird extends Animal implements Flyable, Walkable {
    private Wing mWings;
    private Foot mFoot;

    public Bird(float weight, float height, Point point, Wing wings) {
        super(weight, height, point);
        this.mWings = wings;
        setEnvironment(Environment.Land);
    }

    @Override
    public void move(int toX, int toY) {
        switch (getEnvironment()) {
            case Air:
                fly(toX, toY);
            case Land:
                walk(toX, toY);
            case Water:
                break;
        }
    }

    public Wing getWings() {
        return mWings;
    }

    @Override
    public void fly(int toX, int toY) {
        if (getLiftForce() < getWeight()) {
            System.out.println("can't fly");
        }
    }

    @Override
    public void walk(int toX, int toY) {

    }

    @Override
    void breath() {
        System.out.println("bird breath with lung");
    }

    @Override
    int procreate() {
        return 0;
    }

    @Override
    public int getLiftForce() {
        return mWings.getPower();
    }
}
