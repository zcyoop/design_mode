package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FIleFactory {
    private Map<String,File> files = new HashMap<String,File>();

    public File getFile(String name){
        final File f = files.get(name);
        if (f==null){
            final ConcreteFile concreteFile = new ConcreteFile(name);
            files.put(name,concreteFile);
            return concreteFile;
        }else {
            return f;
        }
    }

    public int getFilesCount() {
        return files.size();
    }
}
