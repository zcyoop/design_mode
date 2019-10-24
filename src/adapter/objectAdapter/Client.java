package adapter.objectAdapter;

public class Client {
    public static void main(String[] args) {
        final Phone p = new Phone();

        p.charge(new VoltageAdapter(new Power220V()));
    }
}
