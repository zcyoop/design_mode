package singleton;

/**
 * 懒汉式（同步方法实现）
 * 优点：能够实现懒加载，且没有线程安全问题
 * 缺点：如果实例的对象够多，方法同步块的实现方式效率会很低
 *
 * @author zcy
 */
public class SingtetonType3 {

    private static SingtetonType3 s;

    private SingtetonType3() {}

    public static synchronized SingtetonType3 getInstance() {
        if (s==null){
            s = new SingtetonType3();
        }
        return s;
    }
}
