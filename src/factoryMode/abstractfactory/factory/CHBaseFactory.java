package factoryMode.abstractfactory.factory;

import factoryMode.abstractfactory.refrigerator.CHRefrigeratorBig;
import factoryMode.abstractfactory.refrigerator.CHRefrigeratorSmall;
import factoryMode.abstractfactory.refrigerator.Refrigerator;
import factoryMode.abstractfactory.television.CHTelevsion32;
import factoryMode.abstractfactory.television.CHTelevsion44;
import factoryMode.abstractfactory.television.Television;

public class CHBaseFactory extends BaseFactory {

    public CHBaseFactory(){
        this.brand = "长虹";
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
        tv.makeup();
        return tv;
    }

    Refrigerator createRefrigerator(String size){
        Refrigerator r = null;

        switch (size){
            case "小": r= new CHRefrigeratorSmall();
                break;
            case "大":r=new CHRefrigeratorBig();
                break;
        }
        r.makeup();
        return r;
    }
}
