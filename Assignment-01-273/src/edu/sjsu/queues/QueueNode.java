package edu.sjsu.queues;

public class QueueNode {
	
	private String Name;
	private int minstodep;
	private QueueNode nextNode;
	
	QueueNode() 
	{
		this.Name = "";
		this.minstodep = 0;
		this.nextNode = null;
	}
	
	public String getName()
	{
		return this.Name;
	}
	
	public int getminstodep()
	{
		return this.minstodep;
	}
	
	public QueueNode getnextNode()
	{
		return this.nextNode;
	}
	public void setName(String name)
	{
		this.Name = name;
	}
	
	public void setminstodep(int minstodep)
	{
		this.minstodep = minstodep;
	}
	
	public void setnextNode(QueueNode nextNode)
	{
		this.nextNode = nextNode;
	}


}
