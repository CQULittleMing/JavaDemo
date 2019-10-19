package environment;

import life.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class AnimalWorld {

    List<Animal> mAnimals = new ArrayList<>();

    public static void main(String[] args) {
        AnimalWorld world = new AnimalWorld();
        Bat bat = new Bat(new Point(1, 2));
        world.mAnimals.add(bat);
        Ostrich ostrich = new Ostrich(new Point(1, 2));
        world.mAnimals.add(ostrich);
        Penguin penguin = new Penguin(new Point(1, 1));
        world.mAnimals.add(penguin);
        Shark shark = new Shark(new Point(1, 1));
        world.mAnimals.add(shark);
        Swan swan = new Swan(new Point());
        world.mAnimals.add(swan);
        Tiger tiger = new Tiger(new Point());
        world.mAnimals.add(tiger);
        Whale whale = new Whale(new Point());
        world.mAnimals.add(whale);

        world.mAnimals.forEach(new Consumer<Animal>() {
            @Override
            public void accept(Animal animal) {
                if (animal instanceof Flyable) {
                    System.out.println(animal.getClass().getSimpleName() + " can fly");
                }
                if (animal instanceof Swimable) {
                    System.out.println(animal.getClass().getSimpleName() + " can swim");
                }
            }
        });

        world.mAnimals.forEach(new Consumer<Animal>() {
            @Override
            public void accept(Animal animal) {
                animal.move(0, 0);
            }
        });
    }
}
