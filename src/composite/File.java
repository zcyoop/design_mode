package composite;

public abstract class File {
    private String name;

    public File(String name){
        this.name = name;
    }

    public void add(File f){
        throw new UnsupportedOperationException();
    }

    public void remove(File f){
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void operate();
}
