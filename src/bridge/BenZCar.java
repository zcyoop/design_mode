package bridge;

public class BenZCar extends AbstractCar {
    public BenZCar(Transmission t) {
        super(t);
    }

    @Override
    public void run() {
        t.gear();
        System.out.println("奔驰车在跑");
    }
}
