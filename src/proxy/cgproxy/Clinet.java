package proxy.cgproxy;

public class Clinet {
    public static void main(String[] args) {
        final UserDao target = new UserDao();

        final ProxyFactory factory = new ProxyFactory(target);

        final UserDao instance = (UserDao) factory.getInstance();
        instance.lecture("语文");
    }
}
