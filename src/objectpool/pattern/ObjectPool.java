package objectpool.pattern;

import java.util.concurrent.ConcurrentLinkedQueue;

abstract class ObjectPool<T> { 
	
	private ConcurrentLinkedQueue<T> pool;  
    	       
    public ObjectPool(final int minObjects) {       
    	pool = new ConcurrentLinkedQueue<T>();  
        for (int i = 0; i < minObjects; i++) {  
            pool.add(createObject());  
        }   
    }
	  
    protected abstract T createObject();
	
    public T borrowObject() {  
        T object;  
        if ((object = pool.poll()) == null) {  
            object = createObject();  
        } 
        return object;  
    }
	
    public void returnObject(T object) {  
        if (object == null) {  
            return;  
        }  
        this.pool.offer(object);  
    }
}
