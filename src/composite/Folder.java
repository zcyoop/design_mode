package composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends File {
    List<File> files = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void add(File f) {
        files.add(f);
    }

    @Override
    public void remove(File f) {
        files.remove(f);
    }

    @Override
    public void operate() {
        System.out.println("------" + getName() + "------");
        for (int i = 0; i < files.size(); i++) {
            files.get(i).operate();
        }
    }
}
