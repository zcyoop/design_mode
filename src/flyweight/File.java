package flyweight;

abstract public class File {
    String name = null;

    public File(String name){
        this.name = name;
    }

    abstract public void openFile(User u);
}
