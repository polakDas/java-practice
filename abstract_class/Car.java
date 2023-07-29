package abstract_class;

public class Car extends Vehicle {
    public Car() {
    }

    @Override
    public void startEngine() {
        System.out.println("Engine has been stared");
    }

    public void increaseSpeed() {
        this.speed += 10;
        System.out.println("Current speed is " + this.speed);
    }

}
