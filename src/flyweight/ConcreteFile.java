package flyweight;

public class ConcreteFile extends File {
    public ConcreteFile(String name) {
        super(name);
    }

    @Override
    public void openFile(User u) {
        System.out.println(u.getUsername() + " 正在使用 " + this.name);
    }
}
