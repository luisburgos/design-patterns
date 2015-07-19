package composite.examples.directories;

/**
 * Created by luisburgos on 18/07/15.
 */
public class FileSystemTestDrive {

    public static void main(String[] args) {

        //Dummy linux file system.

        File home = new Directory("home");
        File opt  = new Directory("opt");
        File usr = new Directory("usr");

        File root = new Directory("root");

        root.add(home);
        root.add(opt);
        root.add(usr);

        usr.add(new SimpleFile("bin"));
        usr.add(new SimpleFile("lib"));

        opt.add(new SimpleFile("google"));
        opt.add(new SimpleFile("idea"));
        opt.add(new SimpleFile("spotify"));

        home.add(new SimpleFile("luisburgos"));

        FileSystem fileSystem = new FileSystem(root);
        fileSystem.printFiles();
    }
}
