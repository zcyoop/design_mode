package decorator;

public class Coffee extends Drink{

    public float cost() {
        return getPrice();
    }
}
