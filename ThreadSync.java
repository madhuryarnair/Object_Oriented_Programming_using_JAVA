//Thread Synchronisation

import java.io.*;
import java.lang.*;

class Sync
{
	synchronized void print(int number) //Synchronized method to avoid mixing up of Even and Odd Numbers
	{
		if (number == 1)
			System.out.print("\n\nOdd Numbers:- \n");
				
		else if (number == 2)
			System.out.print("\n\nEven Numbers:- \n");

		System.out.print("\t"+number);
	}
}

	
class Odd extends Thread //To find Odd Numbers
{
	Sync s;
	
	Odd(Sync s)
	{
		this.s = s;
	}	
	
	public void run()
	{
		for (int i=1 ; i<=100 ; i++)
		{
			if ((i%2) != 0)
				s.print(i);
		}		
	}
}

	
class Even extends Thread //To find Even Numbers
{
	Sync s;
	
	Even(Sync s)
	{
		this.s = s;
	}	
	
	public void run()
	{
		for (int i=1 ; i<=100 ; i++)
		{
			if ((i%2) == 0)
				s.print(i);
		}		
	}
}	


class ThreadSync
{
	public static void main(String args[])
	{
		Sync s = new Sync();
		
		new Odd(s).start();
		new Even(s).start();
	}
}