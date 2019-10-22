package factoryMode.SimpleFactory.television;

public abstract class Television {
    String id;

    public String getId(){
        return id;
    }

    public void play(){
        System.out.println(id+"正在播放");
    }
}
