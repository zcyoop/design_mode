package proxy.dynamicproxy;

public class UserDao implements UserDaoInterface {
    @Override
    public void lecture(String subject) {
        System.out.println("正在授课，课程:" + subject);
    }
}
