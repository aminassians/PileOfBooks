
package Project1;

import java.util.Scanner;

public class VectorTest {

	public static void main(String[] args) 
	{
		StackInterface<String> stack = new PileOfBookVector<>();

		Scanner scnr = new Scanner(System.in);
		
		int choice;
		do{
			System.out.println("\nChoose Menu :\n"
		           				+ "1-To Add Book into Pile\n"
		        		   		+ "2-To Remove the top Book from Pile\n"
		        		   		+ "3-Show the top book\n"
		        		   		+ "4-To clear all the books in pile\n"
		        		   		+ "5-To Exit Menu");
			choice = scnr.nextInt();
		           
		    if(choice == 1)
		    {
		    	System.out.println("Enter Book Title");
		        String title = scnr.next();   
		        stack.push(title);
		        
		    }
		                 
		    else if(choice == 2)
		    {
		    	if(!stack.isEmpty())
		    	{
		        System.out.println(stack.pop() + " Book Removed");
		    	}
		    	else 
		    	{
		    		System.out.println("Stack is Empty.");
		    	}
		    }
		     
		    else if(choice == 3)
		    {
		    	if(!stack.isEmpty())
		    	{
		    		
		    		 System.out.println(stack.peek());
		    		
		    	}
		    	else 
		    	{
		    		System.out.println("Stack is Empty.");
		    	}
		    }

		                 
		    else if(choice == 4)
		    {
		    	stack.clear();
		    	System.out.println("Stack is Empty.");
		    }
		              
		    else if(choice == 5)
		    {
		    	System.out.println("Exiting Menu Bye Bye...!");
		    }

		    else if (choice != 5)
		    {
		    	System.out.println( "Invalid selection. Please try again.");
		    }	    
			  
		}while(choice != 5);
		scnr.close();
	}

}
