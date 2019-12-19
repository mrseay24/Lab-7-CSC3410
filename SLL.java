public class SLL<T> {
	protected SLLNode<T> head, tail;  
    public SLL() {
    	head = tail = null;     
    	}  
    public boolean isEmpty() {
    	return head == null;     
    	}  
    public void addToHead(T el) {
    	// to be implemented 
    	head = el;
    	}  
    public void addToTail(T el) {
    	// to be implemented 
    	 if (!isEmpty()) {
    		 tail.next = new SLLNode(el);  
    		 tail = tail.next;         
    		 }
    	 else { 
    		 head = tail = new SLLNode(el); 
    		 }   
    	}  
    
    public T deleteFromHead() {
		return null; // delete the head and return its info;          
    	// to be implemented     
    	}   
    
  
    public T deleteFromTail() {
		return null; // delete the tail and return its info;         
    	// to be implemented     
    	}  
    
    public void delete(T el) { // delete the node with an element el;         
    	// to be implemented     
    	}  
    
    public void printAll() {
    	// to be implemented     
    	}  
    
    public boolean isInList(T el) {
		return false;
    	// to be implemented     
    	} 
    }
    