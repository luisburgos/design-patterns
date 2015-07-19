package composite.examples.directories;

import java.util.ArrayList;

/**
 * Created by luisburgos on 18/07/15.
 */
public class Directory extends File {

    private ArrayList<File> files;

    public Directory (String name) {
        this.name = name;
        files = new ArrayList<>();
    }

    @Override
    public void add(File file) {
        files.add(file);
    }

    @Override
    public void remove(File file) {
        files.remove(file);
    }

    @Override
    public void showInfo() {
        System.out.print(identado.toString() + "* Directory: " + getName() + "\n");
        identado.append("   ");
        for(File file : files){
            file.showInfo();
        }
        identado.setLength(identado.length() - 3);
    }


}
