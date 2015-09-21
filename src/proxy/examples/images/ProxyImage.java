package proxy.examples.images;

/**
 * Created by luisburgos on 21/09/15.
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String imageFileName;

    public ProxyImage(String fileName){
        this.imageFileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(imageFileName);
        }
        realImage.display();
    }

}
