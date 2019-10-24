package adapter.classAdapter;

public class Phone {
    public void charge(Power5V p){
        final int i = p.output5V();
        System.out.println("正在使用"+i+"V 电源进行充电");
    }
}
