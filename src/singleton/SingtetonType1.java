package singleton;

/**
 * 饿汉式（静态常量实现）
 * 优点：代码简单，容易实现
 * 缺点：只要该类被加载，s对象就会被加载，会浪费一定资源
 *
 * @author zcy
 */
public class SingtetonType1 {

    private static final SingtetonType1 s = new SingtetonType1();

    private SingtetonType1(){}

    public static SingtetonType1 getInstance() {
        return s;
    }
}
