//DLL

import java.util.*;
class DLL
{
	public static void main(String args[])
	{
		LinkedList<Integer> l = new LinkedList<Integer>();
		Scanner s = new Scanner(System.in);
		
		int ch;
		
		do
		{
			System.out.println("\nMain Menu:");
			System.out.println("1: Insert an element");
			System.out.println("2: Delete an element");
			System.out.println("3: Display the contents of the Doubly Linked List");
			System.out.println("4: Exit");
			System.out.print("Enter your choice: ");
			ch = s.nextInt();
			
			switch(ch)
			{
				case 1:
						System.out.print("Enter the element to be inserted: ");
						int data = s.nextInt();
						
						l.add(data);
						
						System.out.println("Insertion Successful");
						break;
					
				case 2:
						System.out.print("Enter the element to be deleted: ");
						int item = s.nextInt();
						
						int index = l.indexOf(item);
						l.remove(index);
						
						System.out.println("Deletion Successful");
						break;
						
				case 3:
						if (l.isEmpty())
							System.out.println("List is Empty");
						
						else
						{
							System.out.println("The contents of the Doubly Linked List is,");
							
							Iterator<Integer> itr = l.iterator();
							while (itr.hasNext())
								System.out.print(itr.next() + "\t");
							
							System.out.print("\n");

						}
						
						break;
						
				case 4:
						System.out.println("Exiting the menu");
						break;
						
				default:
						System.out.println("Please enter a valid choice");
			}
		}
		while (ch != 4);
	}
}