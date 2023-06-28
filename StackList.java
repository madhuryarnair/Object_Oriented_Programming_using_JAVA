import java.lang.*;
import java.util.*;

class Pop extends Thread
{
	Stack<Integer> s;
	
	Pop(Stack<Integer> s)
	{
		this.s = s;
	}
	
	public void run()
	{
		try
		{
			sleep(5000);
		}
		
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		int data = s.pop();
		
		System.out.println("The element being deleted is " + data);
		
		System.out.println("The stack after deletion is,");
		System.out.println(s);
	}
}

class Push extends Thread
{
	Stack<Integer> s;
	int item;
	
	Push(Stack<Integer> s, int item)
	{
		this.s = s;
		this.item = item;
	}
	
	public void run()
	{
		System.out.println("The element being inserted is " + item);
		s.push(item);
		
		System.out.println("The stack after insertion is,");
		System.out.println(s);
	}
}

class RandomThread extends Thread
{
	Stack<Integer> s;
	
	RandomThread(Stack<Integer> s)
	{
		this.s = s;
	}
	
	public void run()
	{
		Random rn = new Random();
		
		for (int i=0 ; i<10 ; i++)
		{
			int num = rn.nextInt(100) + 1;
			
			try
			{
				sleep(1000);
				
				new Push(s,num).start();
				new Pop(s).start();
			}
			
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

class StackList
{
	public static void main(String args[])
	{
		Stack<Integer> s = new Stack<Integer>();
		
		RandomThread r = new RandomThread(s);
		r.start();
	}
}
				
				
			

		