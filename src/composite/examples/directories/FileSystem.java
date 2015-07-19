package composite.examples.directories;

/**
 * Created by luisburgos on 18/07/15.
 */
public class FileSystem {

    private File allFiles;

    public FileSystem(File allFiles) {
        this.allFiles = allFiles;
    }

    public void printFiles() {
        allFiles.showInfo();
    }


}
