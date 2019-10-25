package bridge;

public abstract class AbstractCar {

    Transmission t;

    public abstract void run();

    public AbstractCar(Transmission t){
        this.t = t;
    }
}
