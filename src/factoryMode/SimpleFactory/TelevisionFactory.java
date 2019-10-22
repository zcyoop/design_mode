package factoryMode.SimpleFactory;

import factoryMode.SimpleFactory.television.Television;
import factoryMode.SimpleFactory.television.Television32;
import factoryMode.SimpleFactory.television.Television44;

public class TelevisionFactory {

    public static Television createTV(String id) {
        Television tv = null;

        switch (id) {
            case "32":
                tv = new Television32();
                break;
            case "44":
                tv = new Television44();
                break;
        }

        return tv;
    }

}
