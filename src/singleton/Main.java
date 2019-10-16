package singleton;

public class Main {
    public static void main(String[] args) {
        //方式一：饿汉式（静态变量）
        final SingtetonType1 type1Obj1 = SingtetonType1.getInstance();
        final SingtetonType1 type1Obj2 = SingtetonType1.getInstance();
        compareClass(type1Obj1,type1Obj2);

        //方式二：饿汉式（静态代码块）
        final SingtetonType2 type2Obj1 = SingtetonType2.getInstance();
        final SingtetonType2 type2Obj2 = SingtetonType2.getInstance();
        compareClass(type2Obj1,type2Obj2);

        //方式三：懒汉式（同步方法）
        final SingtetonType3 type3Obj1 = SingtetonType3.getInstance();
        final SingtetonType3 type3Obj2 = SingtetonType3.getInstance();
        compareClass(type3Obj1,type3Obj2);

        //方式四：懒汉式（同步代码块）
        final SingtetonType4 type4Obj1 = SingtetonType4.getInstance();
        final SingtetonType4 type4Obj2 = SingtetonType4.getInstance();
        compareClass(type4Obj1,type4Obj2);

        //方式五：懒汉式（双重检测）
        final SingtetonType5 type5Obj1 = SingtetonType5.getInstance();
        final SingtetonType5 type5Obj2 = SingtetonType5.getInstance();
        compareClass(type5Obj1,type5Obj2);

        //方式六：懒汉式（静态内部类）
        final SingtetonType6 type6Obj1 = SingtetonType6.getInstance();
        final SingtetonType6 type6Obj2 = SingtetonType6.getInstance();
        compareClass(type6Obj1,type6Obj2);

        final SingtetonType7 type7Obj1 = SingtetonType7.INSTANCE;
        final SingtetonType7 type7Obj2 = SingtetonType7.INSTANCE;
        compareClass(type7Obj1,type7Obj2);
    }

    private static <T> void compareClass(T obj1,T obj2){
        System.out.println("对比内存地址是否相等："+(obj1==obj2));
        System.out.println("obj1 hashcode："+obj1.hashCode());
        System.out.println("obj2 hashcode："+obj2.hashCode());
        System.out.println();
    }
}
