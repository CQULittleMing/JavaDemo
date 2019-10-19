package life;

interface Walkable extends Movable {

    @Override
    default void move(int toX, int toY) {
        walk(toX, toY);
    }

    void walk(int toX, int toY);
}
