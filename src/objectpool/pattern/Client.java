package objectpool.pattern;

public class Client implements Runnable {  
    
	private ObjectPool<HeavyObject> pool;  
    private int threadNo;  
    
    public Client(ObjectPool<HeavyObject> pool, int threadNo){  
        this.pool = pool;  
        this.threadNo = threadNo;  
    }  
  
    public void run() {  
        // get an object from the pool  
        HeavyObject heavyObject = pool.borrowObject();  
        System.out.println("Thread " + threadNo + ": Object with process no. " + heavyObject.getObjectNo() + " was borrowed");  

		try {
			heavyObject.doStuff();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

        // return ExportingProcess instance back to the pool  
        pool.returnObject(heavyObject);  

        System.out.println("Thread " + threadNo +": Object with process no. " + heavyObject.getObjectNo() + " was returned");  
    }
}
