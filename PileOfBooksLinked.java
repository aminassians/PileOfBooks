package Project1;

import java.util.*;

public class PileOfBooksLinked<T> implements StackInterface<T> 
{
	private Node topNode; //The first node in the chain
	
	public PileOfBooksLinked() 
	{
		topNode = null;
	}//end default constructor
	
	private class Node
	{
		private T data; //Entry to the stack
		private Node next;  //link to next node
		
		private Node(T dataPortion)
		{
			data = dataPortion;
		}//end constructor
		
		private Node(T dataPortion, Node nextNode)
		{
			data = dataPortion;
			next = nextNode;
		}//end constructor
		
		private T getData() 
		{
			return data;
		}//end getData
		
		private void setData(T newData)
		{
			data = newData;
		}//endSetData
		
		private Node getNextNode() 
		{
			return next;
		}//end getNextNode
		
		private void setNextNode(Node nextNode)
		{
			next = nextNode; 
		}//end setNextNode
	}

	public void push(T newEntry)
	{
		//Node newNode = new Node(newEntry, topNode);
		//topNode = newNode;
		topNode = new Node(newEntry, topNode); 
	} // end push


	public T pop()
	{
		T top = peek(); // Might throw EmptyStackException
		// Assertion: topNode != null
		topNode = topNode.getNextNode();
		return top;
	} // end pop


	public T peek()
	{
		if (isEmpty())
			throw new EmptyStackException();
		else
			return topNode.getData();
	} // end peek


	public boolean isEmpty()
	{
		return topNode == null;
	} // end isEmpty
	
	public void clear()
	{
		topNode = null;
	} // end clear

}
