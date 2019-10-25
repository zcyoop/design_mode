package bridge;

public class Client {
    public static void main(String[] args) {
        final BenZCar car = new BenZCar(new Manual());

        car.run();

    }
}
