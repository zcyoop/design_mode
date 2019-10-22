package factoryMode.SimpleFactory;


import factoryMode.SimpleFactory.television.Television;
import static factoryMode.SimpleFactory.TelevisionFactory.*;


//客户类，用于购买电视
public class Client {
    public static void main(String[] args) {
        final Television tv = createTV("32");
        tv.play();
    }
}
