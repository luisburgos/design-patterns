package singleton.pattern;

/**
 * Created by luisburgos on 19/07/15.
 */
public class Singleton {

    static Singleton instance;

    private Singleton () {

    }

    /**
     * The instance gets created only when it is called for first time.
     * Lazy-loading.
     * This way singleton is thread-safe
     * @return
     */
    public synchronized static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;

    }

}
