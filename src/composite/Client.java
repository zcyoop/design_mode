package composite;

public class Client {
    public static void main(String[] args) {
        final File f = new Folder("分类文件夹");

        final File f1 = new Folder("视频文件夹");
        final File f2 = new Folder("图片文件夹");

        final File imgf1 = new ImageFile("图片1");
        final File imgf2 = new ImageFile("图片2");

        final File vf1 = new VedioFile("视频1");
        final File vf2 = new VedioFile("视频2");

        f.add(f1);
        f.add(f2);

        f2.add(imgf1);
        f2.add(imgf2);

        f1.add(vf1);
        f1.add(vf2);

        f2.operate();
    }
}
