package abstract_class;

public class Client {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();
        myCar.setSpeed(40);
        myCar.increaseSpeed();

    }
}
