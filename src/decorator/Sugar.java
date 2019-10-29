package decorator;

public class Sugar extends Decorator {
    public Sugar(Drink obj) {
        super(obj);
        setDes("糖");
        setPrice(1.5f);
    }
}
