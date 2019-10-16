package singleton;

/**
 * 懒汉式（双重检测）
 *
 * 双重检测实例对象，在对象实现后，无论后续有多少个对象需要实现都只会经过一次if判断而不用进入同步代码块
 *
 * @author zcy
 */
public class SingtetonType5 {

    private static SingtetonType5 s;

    private SingtetonType5() {}

    public static SingtetonType5 getInstance() {

        if (s==null){
            synchronized (SingtetonType5.class){
                if (s==null){
                    s = new SingtetonType5();
                }
            }
        }
        return s;
    }
}
