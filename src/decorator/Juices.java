package decorator;

public class Juices extends Drink {

    public Juices(){
        setPrice(10);
        setDes("果汁");
    }

    @Override
    public float cost() {
        return 0;
    }
}
