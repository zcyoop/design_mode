package adapter.interfaceAdapter;

public class Client extends DemoListerner{

    //假设DemoListenerInterface是一个监听接口、DemoListener是一个实现接口的抽象类，这里需要监听程序开始，只需要重写onStart方法
    @Override
    public void onStart() {
        System.out.println("程序开始了");
    }
}
