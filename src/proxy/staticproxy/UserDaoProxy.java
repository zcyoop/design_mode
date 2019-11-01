package proxy.staticproxy;

public class UserDaoProxy implements UserDaoInterface{

    private UserDaoInterface target;

    public UserDaoProxy(UserDaoInterface target){
        this.target = target;
    }

    @Override
    public void lecture(String subject) {
        System.out.println("代理开始");
        target.lecture(subject);
        System.out.println("代理结束");
    }
}
