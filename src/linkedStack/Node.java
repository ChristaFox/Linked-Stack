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

public class Node <T> 
{
	/**
	 * creates 3 feilds to store the data passed to the node, 
	 * the reference or next node, and the node element.
	 */
	private Node <T> next;
	private T data;
	private Node<T> element;
	
	/****************************************************
	 * Method     : Parameterized generic Node Constructor
	 *
	 * Purpose    : Creates a default node that will 
	 * 				initialize with data, but does not  
	 * 				have a reference node.
	 *
	 * Parameters : It would take in generic data to assign
	 * 				to the node.
	 *
	 * Returns    : This method does not return a value.
	 *
	 ****************************************************/
	public Node (T n)
	{
		data = n;
		next = null;
	}
	
	/****************************************************
	 * Method     : setNext 
	 *
	 * Purpose    : Sets which node will be next in the 
	 * 				list or the reference to it.
	 *
	 * Parameters : It would take in a generic node.
	 *
	 * Returns    : This method does not return a value.
	 *
	 ****************************************************/
	public void setNext (Node <T> n)
	{
		next = n;
	}
	
	/****************************************************
	 * Method     : getNext 
	 *
	 * Purpose    : Returns the next node in the list
	 *
	 * Parameters : None.
	 *
	 * Returns    : This method returns a node.
	 *
	 ****************************************************/
	public Node <T> getNext ()
	{
		return next;
	}
	
	/****************************************************
	 * Method     : Overridden toString
	 *
	 * Purpose    : Will print the data contained in the 
	 * 				node separated by a new line; not the 
	 * 				node itself.
	 *
	 * Parameters : None.
	 *
	 * Returns    : This method returns a node.
	 *
	 ****************************************************/
	public String toString ()
	{
		return data + "\n";
	}
	
	/****************************************************
	 * Method     : isLast
	 *
	 * Purpose    : If the next node is not available; you 
	 * 				are at the end of the list.  
	 *
	 * Parameters : None.
	 *
	 * Returns    : This method returns true or false.
	 *
	 ****************************************************/
	public boolean isLast ()
	{
		return next == null;
	}

	 /****************************************************
	 * Method     : getData
	 *
	 * Purpose    : returns the data stored in the node.  
	 *
	 * Parameters : None.
	 *
	 * Returns    : This method returns generic data.
	 *
	 ****************************************************/
	public T getData() 
	{
		return data;
	}
	
	 /****************************************************
	 * Method     : getElement
	 *
	 * Purpose    : Returns the node.  
	 *
	 * Parameters : None.
	 *
	 * Returns    : This method returns a node.
	 *
	 ****************************************************/
	public Node<T> getElement() 
	{
		return element;
	}

	 /****************************************************
	 * Method     : setElement
	 *
	 * Purpose    : This method sets a new node.  
	 *
	 * Parameters : This takes in a node.
	 *
	 * Returns    : This method does not return a value.
	 *
	 ****************************************************/
	public void setElement(Node<T> element) 
	{
		this.element = element;
	}	

}
