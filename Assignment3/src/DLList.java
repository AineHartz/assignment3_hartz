
public class DLList 
{
	DLNode head;
	DLNode tail;
	int size;
	
	public DLList()
	{
		head = null;
		tail = null;
		size = 0;
	}
	
	public void listAdd(Book p)
	{
		DLNode node = new DLNode(p);
		
		if(head == null)
		{
			head = node;
			tail = node;
			size++;
		}
		
		else
		{
			tail.next = node;
			node.previous = tail;
			tail = node;
			size++;
		}
	}
	
	public void listRemove(int pos)
	{
		int i;
		DLNode temp = new DLNode(null);
		
		//This if/else statement prevents invalid inputs. 
		if(pos < size && pos >= 0)
		{
			//Probably far from optimal, but this if/else statement improves the average
			//realtime the method takes by starting from head if the pos is in the first
			//half and starting at the tail if it's in the second half. The size != 0 
			//thing is just to prevent input errors. 
			if(pos < (size / 2) && size != 0)
			{
				i = 0;
				DLNode previous = head;
				
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
			
			else
			{
				i = size;
				DLNode next = tail;
				
				while(i > pos)
				{
					next = next.previous;
					i--;
				}
				
				if(i == 0)
				{
					head = next.next;
				}
				
				else
				{
					temp = next.next;
					temp = temp.next;
					next.next = temp;
				}
				
				size--;
			}
		}
	}
	
	public String toString()
	{
		String output = "";
		DLNode current = head;
		
		while(current.next != null)
		{
			output += current.value.toString() + "\n";
			current = current.next;
		}
		
		output += current.value.toString();
		
		return output;
	}
}
