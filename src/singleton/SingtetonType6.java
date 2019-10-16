package singleton;

/**
 * 懒汉式（静态内部类）
 *
 * 当类被加载时，静态内部类并不会被加载，只有当调用getInstance方法时才会加载内部类，以此来实现懒加载
 *
 * @author zcy
 */
public class SingtetonType6 {

    private static SingtetonType6 s;

    private SingtetonType6() {}

    private static class SingtetonTypeInstance{
        private static final SingtetonType6 s = new SingtetonType6();
    }

    public static SingtetonType6 getInstance() {
        return SingtetonTypeInstance.s;
    }

    public static void printSome(){
        System.out.println("bbb");
    }
}
