package proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
        final UserDao target = new UserDao();
        final UserDaoProxy userDaoProxy = new UserDaoProxy(target);
        userDaoProxy.lecture("数学");
    }
}
