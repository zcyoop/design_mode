package composite;

public class ImageFile extends File {
    public ImageFile(String name) {
        super(name);
    }

    @Override
    public void operate() {
        System.out.println("it's a ImgFile ,name is " + getName());
    }
}
