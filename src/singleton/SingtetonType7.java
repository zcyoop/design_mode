package singleton;

/**
 * 懒汉式（美剧）
 *
 * 当类被加载时，静态内部类并不会被加载，只有当调用getInstance方法时才会加载内部类，以此来实现懒加载
 *
 * @author zcy
 */
enum SingtetonType7 {
    INSTANCE;

    public void saySome(){
        System.out.println("Yes");
    }
}
