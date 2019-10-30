package facade;

public class Client {
    public static void main(String[] args) {
        final Operate operate = new Operate();
        operate.start();
        operate.end();
    }
}
