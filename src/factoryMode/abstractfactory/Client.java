package factoryMode.abstractfactory;

import factoryMode.abstractfactory.factory.BaseFactory;
import factoryMode.abstractfactory.factory.CHBaseFactory;
import factoryMode.abstractfactory.factory.LGBaseFactory;

public class Client {
    public static void main(String[] args) {
        final LGBaseFactory lgTelevisionFactory = new LGBaseFactory();
        final Object instance = lgTelevisionFactory.getInstance();

        final CHBaseFactory chBaseFactory = new CHBaseFactory();
        final Object instance1 = chBaseFactory.getInstance();
    }
}
