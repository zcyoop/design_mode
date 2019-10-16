package singleton;

/**
 * 懒汉式（同步代码块实现）
 * 优点：能够实现懒加载，且没有线程安全问题
 * 缺点：如果实例的对象够多，方法同步块的实现方式效率会很低
 *
 * @author zcy
 */
public class SingtetonType4 {

    private static SingtetonType4 s;

    private SingtetonType4() {}

    public static  SingtetonType4 getInstance() {
        synchronized (SingtetonType4.class){
            if (s==null){
                s = new SingtetonType4();
            }
        }
        return s;
    }
}
