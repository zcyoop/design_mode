package bridge;

public class BMWCar extends AbstractCar {
    public BMWCar(Transmission t) {
        super(t);
    }

    @Override
    public void run() {
        t.gear();
        System.out.println("宝马车在跑");
    }
}
