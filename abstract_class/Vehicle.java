package abstract_class;

public abstract class Vehicle {
    protected int speed;

    // abstract method
    public abstract void startEngine();

    // concrete method
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }
}
