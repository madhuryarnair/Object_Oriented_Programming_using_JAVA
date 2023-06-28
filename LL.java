//LinkedList class

import java.util.*;

class LL
{
	public static void main(String args[])
	{
		LinkedList<String> name = new LinkedList<String>();
		
		name.add("Madhurya");
		name.add("Mohith");
		name.add("Abhishek");
		name.add("Minnu");
		name.add("Niranjan");
		
		System.out.println(name);
		
		name.remove("Niranjan");
		System.out.println(name);
		
		Iterator<String> itr = name.iterator();
		
		System.out.println("\nThe Linked List is,");
		while (itr.hasNext())
			System.out.println(itr.next());
	}
}
		
		