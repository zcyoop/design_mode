package template;

public class Client {

    public static void main(String[] args) {
        System.out.println("===========制作红豆豆浆==============");
        final RedSoyaBeanMilk m1 = new RedSoyaBeanMilk();
        m1.make();
        System.out.println("===========制作黑豆豆浆==============");
        final BlackSoyaBeanMilk m2 = new BlackSoyaBeanMilk();
        m2.make();
        System.out.println("===========制作纯豆浆================");
        final PureSoyaBeanMilk m3 = new PureSoyaBeanMilk();
        m3.make();
    }
}
