package Project1;

import java.util.EmptyStackException;
import java.util.Vector;

public final class PileOfBookVector<T> implements StackInterface<T>
	{
		private Vector<T> stack; // Last element is the top entry in stack
		private boolean integrityOK;
		private static final int DEFAULT_CAPACITY = 50;
		private static final int MAX_CAPACITY = 10000;

		public PileOfBookVector()
		{
			this(DEFAULT_CAPACITY);
		} // end default constructor
		
		public PileOfBookVector(int initialCapacity)
		{
			integrityOK = false;
			checkCapacity(initialCapacity);
			stack = new Vector<>(initialCapacity); // Size doubles as needed
			integrityOK = true;
		} // end constructor
		
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
			stack.add(newEntry);
		} // end push
		
		public T pop()
		{
			checkIntegrity();
			if (isEmpty())
				throw new EmptyStackException();
			else
				return stack.remove(stack.size() - 1);
		} // end pop
		
		public T peek()
		{
			checkIntegrity();
			if (isEmpty())
				throw new EmptyStackException();
			else
				return stack.lastElement();
		} // end peek
		
		public boolean isEmpty()
		{
			checkIntegrity();
			return stack.isEmpty();
		} // end isEmpty
		
		public void clear()
		{
			checkIntegrity();
			stack.clear();
		} // end clear
		
	}
