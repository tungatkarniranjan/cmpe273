package edu.sjsu.stacks;

public class StackLinkedList {
	
	private StackNode head;  //First element in the stack
	private int SizeOfStack; //number of elements in the stack
	
	StackLinkedList()
	{
		head = null;
		SizeOfStack = 0;
	}

	/*Method: empty()
	 * Checks if the stack is empty or not.
	 */
	public boolean CheckIfEmpty()
	{
		return (SizeOfStack==0);
	}
	
	
	public void push(String value)
	{
		StackNode prevHead = head;
		head = new StackNode();
		head.nextNode = prevHead;
		head.value = value;
		++SizeOfStack;
	}
	
	public String pop()
	{
		String elemValue;
		if(CheckIfEmpty())
			return "";
		elemValue = head.value;
		head = head.nextNode;
		--SizeOfStack;
		return elemValue;
	}	

	public String toString()
	{
		String FullStack = "";
		StackNode iterator = head;
		if(CheckIfEmpty())
			return "";
		for(int i = 0; i < SizeOfStack; i++)
		{
			FullStack+=  iterator.value+ " | ";
			iterator  = iterator.nextNode;
		}
		
		return FullStack;
	}
	
	public String getFirst()
	{
		if(CheckIfEmpty())
			return "";
		return head.value;
	}
	
}
