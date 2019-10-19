package life;

import organ.Mover;

import java.util.List;

public interface Movable {
    void move(int toX, int toY);
    List<Mover> getMovers();
}
