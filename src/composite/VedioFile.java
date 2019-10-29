package composite;

public class VedioFile extends File{
    public VedioFile(String name) {
        super(name);
    }

    @Override
    public void operate() {
        System.out.println("it's a VedioFile ,name is " + getName());
    }
}
