
public class SLList 
{
	SLNode head;
	int size;
	
	public SLList()
	{
		head = null;
		size = 0;
	}
	
	public void listAdd(Book p)
	{
		//Used the following link to remind myself on adding node implementation:
		//https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/
		SLNode node = new SLNode(p);
		
		if(head == null)
		{
			head = node;
			size++;
		}
		
		else
		{
			SLNode last = head;
			
			while(last.next != null)
			{
				last = last.next;
			}
			
			last.next = node;
			size++;
		}
	}
	
	public void listRemove(int pos)
	{
		int i = 0;
		SLNode previous = head;
		SLNode temp = new SLNode(null);
		
		
		if(pos < size && pos >= 0)
		{
			//My implementation didn't work when pos equalled 1, so this if/else
			//fixes that.
			if(pos != 1)
			{
				while(i < pos - 1)
				{
					previous = previous.next;
					i++;
				}
				
				if(i == 0)
				{
					head = previous.next;
				}
				
				else
				{
					temp = previous.next;
					temp = temp.next;
					previous.next = temp;
					size--;
				}
			}
			
			else
			{
				temp = head.next;
				temp = temp.next;
				head.next = temp;
				size--;
			}
		}		
	}
	
	public String toString()
	{
		String output = "";
		SLNode current = head;
		
		while(current.next != null)
		{
			output += current.value.toString() + "\n";
			current = current.next;
		}
		
		output += current.value.toString();
		
		return output;
	}
}
