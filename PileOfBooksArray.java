package Project1;

import java.util.*;

/** A class of stacks whose entries are stored in an array. */
public class PileOfBooksArray<T> implements StackInterface<T> {

	private T[] stack; // Array of stack entries
	private int topIndex; // Index of top entry
	private boolean integrityOK = true;
	private static final int DEFAULT_CAPACITY = 50;
	private static final int MAX_CAPACITY = 10000;
	
	public PileOfBooksArray()
	{
		this(DEFAULT_CAPACITY);
	} // end default constructor
	
	
	public PileOfBooksArray(int initialCapacity)
	{
		integrityOK = false;
		checkCapacity(initialCapacity);
	
		@SuppressWarnings("unchecked")
		T[] tempStack = (T[])new Object[initialCapacity];
		stack = tempStack;
		topIndex = -1;
		integrityOK = true;
	} // end constructor
	
	
	// Throws an exception if this object is not initialized.
	private void checkIntegrity()
	{
		if (!integrityOK)
			throw new SecurityException("ArrayStack object is corrupt.");
	} // end checkIntegrity
	
	
	// Throws an exception if the client requests a capacity that is too large.
	private void checkCapacity(int capacity)
	{
		if (capacity > MAX_CAPACITY)
			throw new IllegalStateException("Attempt to create a bag whose " +
											"capacity exeeds allowed " +
											"maximum of " + MAX_CAPACITY);
	} // end checkCapacity
	
	
	public void push(T newEntry) 
	{
		checkIntegrity();
		ensureCapacity();
		stack[topIndex + 1] = newEntry;
		topIndex++;
	}// end push
	
	private void ensureCapacity()
	{
		if (topIndex >= stack.length - 1) // If array is full, double its size
		{
			int newLength = 2 * stack.length;
			checkCapacity(newLength);
			stack = Arrays.copyOf(stack, newLength);
		} // end if
	} // end ensureCapacity

	
	public T pop() {
		checkIntegrity();
		if (isEmpty())
			throw new EmptyStackException();
		else
		{
			T top = stack[topIndex];
			stack[topIndex] = null;
			topIndex--;
			return top;
		} // end if
	}// end pop

	
	public T peek()
	{
		checkIntegrity();
		if (isEmpty())
			throw new EmptyStackException();
		else
			return stack[topIndex];
	} // end peek

	
	public boolean isEmpty()
	{
		return topIndex < 0;
	} // end isEmpty
	
	
	public void clear()
	{
		checkIntegrity();
		while (topIndex > -1)
		{
			stack[topIndex] = null;
			topIndex--;
		} // end while
		
	} // end clear

}
