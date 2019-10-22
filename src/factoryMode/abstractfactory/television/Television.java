package factoryMode.abstractfactory.television;

public abstract class Television {
    Integer size;
    String brand;

    public String getName(){
        return size+"寸"+brand+"电视";
    }

    public void makeup(){
        System.out.println(getName()+"正在组装");
        System.out.println(getName()+"组装完成");
    }

    public void play(){
        System.out.println(getName()+"正在播放");
    }

}
