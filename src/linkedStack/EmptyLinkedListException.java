/********************************************************
 *
 *  Project :  Project 3 - Linked List
 *  File    :  Fox_Project3
 *  Name    :  Christa Fox
 *  Date    :  February 12, 2014(February 12, 2014)
 *
 *  Description :
 *
 *    1)	This project creates a generic singly linked list.  
 *    		It is tested with both strings and integers--both
 *    		work, but for the purpose of the assignment I chose 
 *    		to create a custom class of books that may be found,
 *    		added, removed, or displayed via a user response in
 *    		the console.
 *
 *    2)	The data structure is a singly linked list.
 *
 *    3)	It is implemented generically.
 *
 *    4)	The implemented end-user methods include the
 *    		following: add book, delete book, find book, 
 *    		and display books.  The actual type is left 
 *    		off in the prompt to increase it's purpose
 *    		(code reuse).
 *
 *  Changes :  None at this time.
 *
 ********************************************************/

package linkedStack;

public class EmptyLinkedListException extends Exception {
	
	private static final long serialVersionUID = 1L;

	/****************************************************
	 * Method     : default constructor of the 
	 * 				EmptyLinkedListException exception
	 *
	 * Purpose    : This creates a custom exception to handle 
	 * 				if the list is empty.
	 *
	 * Parameters : None.
	 *
	 * Returns    : Returns only the exception.
	 *
	 ****************************************************/
	public EmptyLinkedListException ()
	{
		super ();
	}
	
	/****************************************************
	 * Method     : Parameterized constructor of the 
	 * 				EmptyLinkedListException exception.
	 *
	 * Purpose    : This creates a custom exception to handle 
	 * 				if the list is empty.
	 *
	 * Parameters : It takes in a string for a message
	 * 				to display where the error occurred.
	 *
	 * Returns    : Returns the exception and a message.
	 *
	 ****************************************************/
	public EmptyLinkedListException (String s)
	{
		super (s);
	}
	
	public String toString()
	{
		return ("The list is empty");	
	}

}
