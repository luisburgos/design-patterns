package iterator.examples.notifications;

public class NotificationBar {
	NotificationCollection notifications; 
	  
    public NotificationBar() { 
        this.notifications = new NotificationCollection(); 
    } 
  
    public void printNotifications() { 
        Iterator iterator = notifications.createIterator(); 
        System.out.println("-------NOTIFICATION BAR------------"); 
        while (iterator.hasNext()) { 
            Notification n = (Notification)iterator.next(); 
            System.out.println(n.getNotification()); 
        } 
    } 
}
