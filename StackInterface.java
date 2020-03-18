package Project1;

public interface StackInterface<T> 
{
	/** Adds a new entry to the top of the stack. 
 	@param newEntry The object to be added as a new entry. */
	public void push(T newEntry);
	
	/** Removes the top entry of the stack.  
	@return The removed entry of the stack. Note: if the top entry is empty throws exception */
	public T pop();
	
	/** Retrieves the top entry in the stack. 
	@return the top entry in the stack. Note: if the stack is empty throws exception. */
	public T peek();
	
	/** Sees whether this bag is empty. 
	@return True if the bag is empty, or false if not. */
	public boolean isEmpty();
	
	/**  Sets all entries of the stack to the null. */
	public void clear();	
	
}//end StackInterface


