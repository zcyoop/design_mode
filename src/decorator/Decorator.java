package decorator;

public class Decorator extends Drink {

    Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    public float cost() {
        return getPrice() + obj.cost();
    }

    public String getDes() {
        return des + " " + getPrice() + " && " + obj.getDes() + " " + obj.getPrice();
    }
}
