package factoryMode.factorymethod.factory;

import factoryMode.factorymethod.television.*;

public class LGTelevisionFactory extends TelevisionFactory {

    public LGTelevisionFactory(){
        this.brand = "LG";
        getInstance();
    }

    Television createTV(String size) {
        Television tv = null;

        switch (size){
            case "32":tv = new LGTelevsion32();
            break;
            case "44":tv= new LGTelevsion44();
            break;
        }

        return tv;
    }
}
