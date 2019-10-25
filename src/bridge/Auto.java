package bridge;

public class Auto extends Transmission{
    @Override
    public void gear() {
        System.out.println("初始操作模式为自动挡");
        this.operate = "自动挡";
    }
}
