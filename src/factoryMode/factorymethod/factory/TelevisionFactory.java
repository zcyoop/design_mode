package factoryMode.factorymethod.factory;

import factoryMode.factorymethod.television.Television;

import java.util.Scanner;

public abstract class TelevisionFactory {

    String brand;

    abstract Television createTV(String size);

    public Television getInstance(){
        System.out.print("输入"+brand+"电视的尺寸:");
        Scanner sc = new Scanner(System.in);
        final String size = sc.nextLine();
        final Television tv = createTV(size);
        tv.makeup();
        return tv;
    }

}
