
public class gen_AList 
{
	int size;
	int max_size;
	Object[] array;
	
	public gen_AList()
	{
		size = 0;
		max_size = 10;
		array = new Object[10];
	}
	
	public void listAdd(Object p)
	{
		if(size < max_size)
		{
			array[size] = p;
			size++;
		}
		
		else
		{
			max_size += 10;
			Object[] temp_array = new Object[max_size];
			
			for(int i = 0; i < size; i++)
			{
				temp_array[i] = array[i];
			}
			
			array = temp_array;
			array[size] = p;
			size++;
		}
	}
	
	public void listRemove(int pos)
	{
		//just to make sure the index is valid
		if(pos >= 0 && pos <= size)
		{
			if(pos == size)
			{
				size--;
			}
			
			else
			{
				//start at pos, replace every element with the next one to slide everything down
				for(int i = pos; i < size; i++)
				{
					array[i] = array[i+1];
				}
				
				size--;
			}
		}
		
		else
		{
			System.out.println("Sorry, this index is not contained within the array.");
		}
	}
	
	public String toString()
	{
		String output = "";
		
		for(int i = 0; i < size; i++)
		{
			output += array[i].toString() + "\n";
		}
		
		return output;
	}
}
