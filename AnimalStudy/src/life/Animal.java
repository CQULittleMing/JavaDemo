package life;

import environment.Environment;
import organ.Mover;

import java.awt.*;
import java.util.List;

abstract public class Animal extends Life implements Movable{
    private float mWeight;// kg
    private float mHeight;// cm
    private Point mPosition;

    private List<Mover> mMovers;

    public Animal(float weight, float height, Point point) {
        this.mWeight = weight;
        this.mHeight = height;
        this.mPosition = point;
    }

    public float getWeight() {
        return mWeight;
    }

    public void setWeight(float mWeight) {
        this.mWeight = mWeight;
    }

    public float getHeight() {
        return mHeight;
    }

    public void setHeight(float mHeight) {
        this.mHeight = mHeight;
    }

    public Point getPosition() {
        return mPosition;
    }

    public void setPosition(Point point) {
        this.mPosition = point;
    }

    @Override
    public List<Mover> getMovers() {
        return mMovers;
    }

    public void setMovers(List<Mover> movers) {
        this.mMovers.addAll(movers);
    }
}
