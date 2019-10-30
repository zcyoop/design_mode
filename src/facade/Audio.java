package facade;

public class Audio {
    private static Audio audio = new Audio();

    public static Audio getTv() {
        return audio;
    }

    public void on(){
        System.out.println("音响开启。。。");
    }

    public void end(){
        System.out.println("音响关闭。。。");
    }

    public void pause(){
        System.out.println("音响暂停。。。");
    }
}
