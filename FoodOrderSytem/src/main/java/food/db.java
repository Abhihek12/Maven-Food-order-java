package food;

import java.util.ArrayList;
import java.util.Iterator;

public class db {

	public static ArrayList<foods> items;

	static {
		items = new ArrayList<foods>();
	}
	
	public static void display()
	{
		
		Iterator itr = items.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next().toString());
		}
	}
	
	

}
