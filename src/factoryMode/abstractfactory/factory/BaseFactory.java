package factoryMode.abstractfactory.factory;

import factoryMode.abstractfactory.refrigerator.LGRefrigeratorBig;
import factoryMode.abstractfactory.refrigerator.Refrigerator;
import factoryMode.abstractfactory.television.Television;

import java.util.Scanner;

public abstract class BaseFactory {

    String brand;

    abstract Television createTV(String size);

    abstract Refrigerator createRefrigerator(String size);

    public Object getInstance() {
        Object result = null;

        System.out.println("输入" + brand + "的商品编号:  1.冰箱 大号  2.冰箱 小号  3.电视 32寸  4.电视 44寸");

        Scanner sc = new Scanner(System.in);
        final int num = sc.nextInt();
        switch (num) {
            case 1:
                result = createRefrigerator("大");
                break;
            case 2:
                result = createRefrigerator("小");
                break;
            case 3:
                result = createTV("32");
                break;
            case 4:
                result = createTV("44");
                break;

        }
        return result;
    }

}
