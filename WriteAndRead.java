//Reader and Writer

import java.io.*;
import java.util.*;
import java.lang.*;

class WriteAndRead
{
	public static void main(String args[]) throws Exception
	{
		FileWriter w = new FileWriter("C:\\Users\\acer\\OneDrive\\Desktop\\Java\\file.txt");
		
		System.out.println("\nEnter the content to be written to the file:\n");
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		w.write(str);
		w.close();
		
		System. out.println("\nWriting to file was done successfully");
		
		FileReader r = new FileReader("C:\\Users\\acer\\OneDrive\\Desktop\\Java\\file.txt");
		
		int i;
		
		System.out.println("\nThe contents of file.txt are,\n");
		
		while ((i = r.read()) != -1)
			System.out.print((char)i);
			
		r.close();

		System.out.println("\n\nReading from file was done successfully");
		
		FileWriter a = new FileWriter("C:\\Users\\acer\\OneDrive\\Desktop\\Java\\file.txt", true);
		
		System.out.println("\nEnter the content to be written to the file:\n");
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		
		a.write(str1);
		a.close();
	}
}	