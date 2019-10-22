package factoryMode.abstractfactory.refrigerator;

public class Refrigerator {
    String brand;
    String size;
    public String getName(){
        return size+"尺寸"+brand+"冰箱";
    }

    public void makeup(){
        System.out.println(getName()+"正在组装");
        System.out.println(getName()+"组装完成");
    }

    public void play(){
        System.out.println(getName()+"冷藏功能正在运行");
    }
}
