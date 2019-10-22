package factoryMode.abstractfactory.factory;

import factoryMode.abstractfactory.refrigerator.LGRefrigeratorBig;
import factoryMode.abstractfactory.refrigerator.LGRefrigeratorSmall;
import factoryMode.abstractfactory.refrigerator.Refrigerator;
import factoryMode.abstractfactory.television.LGTelevsion32;
import factoryMode.abstractfactory.television.LGTelevsion44;
import factoryMode.abstractfactory.television.Television;

public class LGBaseFactory extends BaseFactory {

    public LGBaseFactory(){
        this.brand = "LG";
    }

    Television createTV(String size) {
        Television tv = null;

        switch (size){
            case "32":tv = new LGTelevsion32();
            break;
            case "44":tv= new LGTelevsion44();
            break;
        }
        tv.makeup();
        return tv;
    }

    Refrigerator createRefrigerator(String size){
        Refrigerator r = null;

        switch (size){
            case "小": r= new LGRefrigeratorSmall();
            break;
            case "大":r=new LGRefrigeratorBig();
            break;
        }
        r.makeup();
        return r;
    }
}
