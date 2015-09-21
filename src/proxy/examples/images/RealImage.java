package proxy.examples.images;

/**
 * Created by luisburgos on 21/09/15.
 */
public class RealImage implements Image {

    private String imageFileName;

    public RealImage(String imageFileName){
        this.imageFileName = imageFileName;
        loadFromDisk(imageFileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + imageFileName);
    }

    private void loadFromDisk(String imageFileName){
        System.out.println("Loading " + imageFileName);
    }

}
