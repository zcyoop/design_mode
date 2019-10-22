package factoryMode.factorymethod.factory;

import factoryMode.factorymethod.television.CHTelevsion32;
import factoryMode.factorymethod.television.CHTelevsion44;
import factoryMode.factorymethod.television.Television;

public class CHTelevisionFactory extends TelevisionFactory {

    public CHTelevisionFactory(){
        this.brand = "LG";
        getInstance();
    }

    @Override
    Television createTV(String size) {
        Television tv = null;

        switch (size){
            case "32":tv = new CHTelevsion32();
            break;
            case "44":tv= new CHTelevsion44();
            break;
        }

        return tv;
    }
}
