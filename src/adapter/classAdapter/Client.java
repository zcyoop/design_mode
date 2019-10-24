package adapter.classAdapter;

public class Client {
    public static void main(String[] args) {
        final Phone p = new Phone();

        p.charge(new VoltageAdapter());
    }
}
