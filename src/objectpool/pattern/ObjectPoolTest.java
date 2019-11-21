package objectpool.pattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class ObjectPoolTest {
	
	private ObjectPool<HeavyObject> pool;  
    private AtomicLong processNo=new AtomicLong(0);  
    
    public static void main(String args[])  {   
        ObjectPoolTest op=new ObjectPoolTest();  
        op.setUp();  
        op.testObjectPool();  
    }
    
    public void setUp() {  
    // Create a pool of objects of type HeavyObject.  
    	pool = new ObjectPool<HeavyObject>(4){  
			protected HeavyObject createObject() {  
			    // create a test object which takes some time for creation  
			    return new HeavyObject( processNo.incrementAndGet() );  
			}  
    	};  
    }  
  	  
	public void testObjectPool() {  
		ExecutorService executor = Executors.newFixedThreadPool(8);  

	    // execute 8 tasks in separate threads  
		executor.execute(new Client(pool, 1));  
		executor.execute(new Client(pool, 2));  
		executor.execute(new Client(pool, 3));  
		executor.execute(new Client(pool, 4));  
		executor.execute(new Client(pool, 5));  
		executor.execute(new Client(pool, 6));  
		executor.execute(new Client(pool, 7));  
		executor.execute(new Client(pool, 8));  
	
	    executor.shutdown();  
	    try {  
	        executor.awaitTermination(30, TimeUnit.SECONDS);  
	    } catch (InterruptedException e){  
	        e.printStackTrace();  
	    }  
	}
}
