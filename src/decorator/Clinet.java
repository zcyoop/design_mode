package decorator;

public class Clinet {
    public static void main(String[] args) {
        //点一份意式咖啡+一份牛奶
        Coffee c1 = new Espresso();
        Drink order = new Milk(c1);

        System.out.println(order.getDes());
        System.out.println("费用:"+order.cost());

        //点一杯咖啡+牛奶+2糖
        Coffee c2 = new LongBlack();

        final Sugar order1 = new Sugar(new Sugar(new Milk(c2)));

        System.out.println(order1.getDes());
        System.out.println("费用:"+order1.cost());
    }
}
