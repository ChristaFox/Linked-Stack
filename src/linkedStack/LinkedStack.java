package linkedStack;

public class LinkedStack<T> implements Stack<T>
{
	/**
	 *Create field to store the first item in the list.
	 */
	private Node <T> head;
	
	/****************************************************
	 * Method     : Default generic SinglyLinkedList Constructor
	 *
	 * Purpose    : Creates a default list with no nodes.
	 *
	 * Parameters : None.
	 *
	 * Returns    : This method does not return a value.
	 *
	 ****************************************************/
	public LinkedStack()
	{
		head = null;
	}
	
	/****************************************************
	 * Method     : isEmpty
	 *
	 * Purpose    : Method used to see if the List Contains Nodes.
	 *
	 * Parameters : None.
	 *
	 * Returns    : This method returns true or false.
	 *
	 ****************************************************/	
	@Override
	public boolean isEmpty() 
	{
		return head == null;
	}

	/****************************************************
	 * Method     : peek 
	 *
	 * Purpose    : Returns the first item in the list, 
	 * 				unless the list is empty.  If the list
	 * 				is empty an EmptyLinkedListException
	 * 				is thrown.
	 *
	 * Parameters : None.
	 *
	 * Returns    : This method does not return a value.
	 * @throws EmptyLinkedListException 
	 *
	 ****************************************************/	
	@Override
	public T peek()
	{
		return (T) head;
	
	}

	/****************************************************
	 * Method     : pop 
	 *
	 * Purpose    : Removes the first item in the list, 
	 * 				unless the list is empty.  If the list
	 * 				is empty an EmptyLinkedListException
	 * 				is thrown.
	 *
	 * Parameters : None.
	 *
	 * Returns    : This method does not return a value.
	 * @throws EmptyLinkedListException 
	 *
	 ****************************************************/	
	@Override
	public T pop() throws EmptyLinkedListException 
	{
		if(isEmpty())
		{
			throw new EmptyLinkedListException (toString());
		}
		else
		{
			head = head.getNext();
		}
		return null;
	}
	
	/****************************************************
	 * Method     : push
	 *
	 * Purpose    : Adds a node to the front of the singly 
	 * 				linked list using data.
	 *
	 * Parameters : It takes in generic data to assign to 
	 * 				the node.
	 *
	 * Returns    : This method does not return a value.
	 *
	 ****************************************************/
	@Override
	public void push(T data)
	{
		Node <T> temp = new Node <T> (data);
		this.push(temp);
	}
		
	/****************************************************
	 * Method     : push
	 *
	 * Purpose    : Adds a generic node to the front of the singly 
	 * 				linked list without data.
	 *
	 * Parameters : It takes in a node.
	 *
	 * Returns    : This method does not return a value.
	 *
	 ****************************************************/
	public void push (Node <T> temp)
	{

		if (isEmpty())
		{
			head = temp;
		}
		//not empty
		else
		{
			temp.setNext (head);
			head = temp;
		}
	}
	
	/****************************************************
	 * Method     : size 
	 *
	 * Purpose    : returns the size of the linked stack.
	 *
	 * Parameters : None.
	 *
	 * Returns    : This method returns a number.
	 *
	 ****************************************************/	
	@Override
	public int size()
	{
		int s = 0;
		if (isEmpty())
		{
			return s;
		}
		else
		{
			Node <T> current = head;
			s++;
			while (!current.isLast())
			{
				current = current.getNext();
				s++;
				
			}
		}
		return s;
	}

}
