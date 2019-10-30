package facade;

public class TV {
    private static TV tv = new TV();

    public static TV getTv() {
        return tv;
    }

    public void on(){
        System.out.println("电视机开启。。。");
    }

    public void end(){
        System.out.println("电视机关闭。。。");
    }

    public void pause(){
        System.out.println("电视机暂停。。。");
    }

}
