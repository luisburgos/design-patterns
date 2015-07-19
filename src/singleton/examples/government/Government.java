package singleton.examples.government;

/**
 * Created by luisburgos on 19/07/15.
 */
public class Government {

    static Government government;

    private Government () { }

    public synchronized static Government getGovernment(){
        if(government == null){
            government = new Government();
        }
        return government;

    }

}
