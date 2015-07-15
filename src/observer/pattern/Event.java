package observer.pattern;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by luisburgos on 15/07/15.
 */
public class Event {

    private int type;
    private String description;
    private Date date;

    public Event(){}

    public Event(int type, String description){
        this.setType(type);
        this.setDescription(description);
        this.date = new Date();
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return dateFormat.format(date);
    }
}
