package life;

public interface Swimable extends Movable {
    @Override
    default void move(int toX, int toY) {
        swim(toX, toY);
    }

    void swim(int toX, int toY);
}
