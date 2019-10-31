package flyweight;

public class Client {
    public static void main(String[] args) {
        final FIleFactory factory = new FIleFactory();

        final File f1 = factory.getFile("文件1");
        final File f2 = factory.getFile("文件2");

        f1.openFile(new User("jack"));
        f2.openFile(new User("jack"));

        f1.openFile(new User("Tom"));

        System.out.println("总共文件数：" + factory.getFilesCount());
    }
}
