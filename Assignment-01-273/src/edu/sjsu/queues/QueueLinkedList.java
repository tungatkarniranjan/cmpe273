package edu.sjsu.queues;

public class QueueLinkedList {
	
	private QueueNode head;
	private QueueNode tail;
	private int SizeOfQueue;
	
	QueueLinkedList()
	{
		head = null;
		tail = null;
		SizeOfQueue = 0;
	}

	public void addLast(String Name, int minstodep)
	{
		if(SizeOfQueue==0)
		{
			head = new QueueNode();
			head.setName(Name);
			head.setminstodep(minstodep);
			head.setnextNode(null);
			tail=head;
			++SizeOfQueue;
		}
		else
		{
			QueueNode tempNode = new QueueNode();
			tempNode.setName(Name);
			tempNode.setminstodep(minstodep);
			tempNode.setnextNode(null);
			tail.setnextNode(tempNode);
			tail = tempNode;
			++SizeOfQueue;
		}
	}

	public void addFirst(String Name, int minstodep)
	{
	
		if(SizeOfQueue==0)
		{
			head = new QueueNode();
			head.setName(Name);
			head.setminstodep(minstodep);
			head.setnextNode(null);
			tail=head;
			++SizeOfQueue;
		}
		else
		{
			QueueNode tempNode = new QueueNode();
			tempNode.setName(Name);
			tempNode.setminstodep(minstodep);
			tempNode.setnextNode(head);
			head = tempNode;
			++SizeOfQueue;
		}
	}
	public String deleteFirst()
	{
		String DeletedValue = "";
		
		if(SizeOfQueue==0)
		{
			System.out.println("Queue is empty");
			return "";
		}
		else
		{
			DeletedValue = head.getName();
			head = head.getnextNode();
			--SizeOfQueue;
		}
		return DeletedValue;
	}
	
	public String checkFirstElement()
	{
		if(SizeOfQueue==0)
		{
			System.out.println("The Queue is empty");
			return "";
		}
		else
			return head.getName();
	}
	
	public String checkLastElement()
	{
		if(SizeOfQueue==0)
		{
			System.out.println("The Queue is empty");
			return "";
		}
		else
			return tail.getName();
	}
	
	public boolean CheckIfEmpty()
	{
		return(SizeOfQueue==0);
	}
	
	public String toString()
	{
		String FullQueue = "";
		
		QueueNode iterator = new QueueNode();
		if(SizeOfQueue==0)
		{
			System.out.println("Underflow");
			return "";
		}
		else
		{
			iterator = head;
			while(iterator != null)
			{
				FullQueue += " | "+iterator.getName()+" ";
				iterator = iterator.getnextNode();
			}
		}
		return FullQueue;
	}
	
	public QueueNode getHead()
	{
		if(SizeOfQueue==0)
		{
			return null;
		}
		return head;
	}

	public int getSize()
	{
		
		if(this.SizeOfQueue==0)
		{
			System.out.println("The Queue is empty");
			return 0;
		}
		return this.SizeOfQueue;
	}
	
	
}
