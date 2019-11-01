package proxy.dynamicproxy;

public class Client {
    public static void main(String[] args) {
        final UserDao userDao = new UserDao();

        final UserDaoProxy userDaoProxy = new UserDaoProxy(userDao);

        final UserDaoInterface instance = (UserDaoInterface) userDaoProxy.getInstance();
        System.out.println(instance);
        System.out.println(instance.getClass());
        instance.lecture("英语");
    }
}
