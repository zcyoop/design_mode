package facade;

public class Operate {
    private Audio audio;
    private TV tv;


    public Operate(){
        audio = new Audio();
        tv = new TV();
    }

    public void start(){
        audio.on();
        tv.on();
    }

    public void end(){
        audio.end();
        tv.end();
    }
}
