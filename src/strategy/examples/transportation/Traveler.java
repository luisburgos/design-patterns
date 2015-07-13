package strategy.examples.transportation;

/**
 * Created by luisburgos on 12/07/15.
 */
public class Traveler {

    private String name;
    private TransportationMode transportationMode;

    public Traveler(){}

    public Traveler(String name){
        this.setName(name);
    }

    public void setTransportationMode(TransportationMode transportationMode){
        this.transportationMode = transportationMode;
    }

    public TransportationMode getTransportationMode(){
        return transportationMode;
    }

    public void travelToAirport(){
        System.out.println(this.toString() + getTransportationMode().travel());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "I am " + getName() + ". ";
    }
}
