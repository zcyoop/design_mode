package singleton;

/**
 * 饿汉式（静态代码块实现）
 * 优点：代码简单，容易实现
 * 缺点：只要该类被加载，s对象就会被加载，会浪费一定资源
 *
 * @author zcy
 */
public class SingtetonType2 {

    static {
        s = new SingtetonType2();
    }

    private static SingtetonType2 s;

    private SingtetonType2() {
    }

    public static SingtetonType2 getInstance() {
        return s;
    }
}
