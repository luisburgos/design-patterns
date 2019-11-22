package iterator.examples.notifications;

public class NotificationCollection implements Collection { 
    
	static final int MAX_ITEMS = 6; 
    int numberOfItems = 0; 
    Notification[] notificationList; 
  
    public NotificationCollection() { 
        notificationList = new Notification[MAX_ITEMS]; 
  
        // Let us add some dummy notifications 
        addItem("Notification 1"); 
        addItem("Notification 2"); 
        addItem("Notification 3"); 
    } 
  
    public void addItem(String str) { 
        Notification notification = new Notification(str); 
        if (numberOfItems >= MAX_ITEMS) { 
            System.err.println("Full"); 
     	} else { 
            notificationList[numberOfItems] = notification; 
            numberOfItems = numberOfItems + 1; 
        } 
    } 
  
    public Iterator createIterator() { 
        return new NotificationIterator(notificationList); 
    } 

}
