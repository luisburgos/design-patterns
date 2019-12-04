package objectpool.pattern;

import java.util.concurrent.TimeUnit;

public class HeavyObject {  
	
	private long objectNo;  
	  
    public HeavyObject(long objectNo)  {  
    	this.objectNo = objectNo;  
        
    	// do some  expensive calls / tasks here in future  
        // .........  
        
    	System.out.println("Object with no. " + objectNo + " was created");  
    }  
     
    public long getObjectNo() {  
        return objectNo;  
    }
    
    public void doStuff() throws InterruptedException {
    	//TimeUnit.SECONDS.sleep(1);
    	System.out.println("Object with no. " + objectNo + " is doing something");
    }
}
