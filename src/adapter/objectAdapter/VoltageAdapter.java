package adapter.objectAdapter;

public class VoltageAdapter implements Power5V {

    private Power220V p;

    public VoltageAdapter(Power220V p){
        this.p = p;
    }

    public int output5V() {
        final int oldsrc = p.output220V();
        System.out.println("获取原电压:"+oldsrc);
        int newsrc = oldsrc/44;
        System.out.println("电压转换后，电压："+newsrc+"V");
        return newsrc;
    }
}
