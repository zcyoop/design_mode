package bridge;

public class Manual extends Transmission{
    @Override
    public void gear() {
        System.out.println("初始操作模式为手动挡");
        this.operate = "手动挡";
    }
}
