package adapter.classAdapter;

public class VoltageAdapter extends Power220V implements Power5V{
    @Override
    public int output5V() {
        final int oldsrc = output220V();
        int newsrc = oldsrc/44;
        System.out.println("电压："+newsrc+"V");
        return newsrc;
    }
}
