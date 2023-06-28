//Garbage Collection

import java.io.*;

class Garbage
{
	int a = 25, b = 35;
	
	protected void finalize()
	{
		System.out.println("Garbage Collection has been implemented successfully");
	}

	public static void main(String args[])
	{
		Garbage g1 = new Garbage();
		Garbage g2 = new Garbage();
		
		System.out.println("a = " + g1.a);
		System.out.println("b = " + g2.b);
		
		g1 = null;
		g2 = null;
		
		System.gc();
	}
}	