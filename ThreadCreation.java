//Threads

import java.io.*;
import java.lang.*;
import java.util.*;

class OddThread extends Thread //To find the cube of the number
{
	int number;
	
	OddThread(int number)
	{
		this.number = number;
	}
	
	public void run()
	{
		System.out.println("Since "+number+" is odd, the cube of "+number+" = "+Math.pow(number,3)+"\n");
	}
}


class EvenThread extends Thread //To find the square of the number
{
	int number;
	
	EvenThread(int number)
	{
		this.number = number;
	}
	
	public void run()
	{
		System.out.println("Since "+number+" is even, the square of "+number+" = "+Math.pow(number,2)+"\n");
	}
}
	

class RandomThread extends Thread //To generate the Random number and check whether it is Even or Odd
{
	public void run()
	{
		Random rn = new Random();
		
		for (int i=0 ; i<10 ; i++)
		{
			int number = rn.nextInt(100) + 1; //Random Number between 1 and 100 (both inclusive) is generated
		
			try
			{
				sleep(1000); //To generate a Random Number every second
				
				System.out.println("The number generated is "+number);
				
				if ((number%2) == 0)
					new EvenThread(number).start();
		
				else
					new OddThread(number).start();
			}
		
			catch(Exception e)
			{
				System.out.println(e);
			}	
		}	
	}
}


class ThreadCreation
{
	public static void main(String args[])
	{
		System.out.println("\n");
		
		RandomThread r = new RandomThread();
		r.start();
	}
}
 	