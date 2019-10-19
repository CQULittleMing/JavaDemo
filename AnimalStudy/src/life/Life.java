package life;

import environment.Environment;

abstract public class Life {
    private Environment mEnvironment;

    abstract void breath();

    abstract boolean eat(float vol, Life a);

    abstract int procreate();

    public Environment getEnvironment() {
        return mEnvironment;
    }

    public void setEnvironment(Environment environment) {
        this.mEnvironment = environment;
    }
}
