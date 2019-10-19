package life;

public interface Flyable extends Movable {

    @Override
    default void move(int toX, int toY) {
        fly(toX, toY);
    }

    void fly(int toX, int toY);

    int getLiftForce();
}
