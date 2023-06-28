//File Exception Handling

import java.io.*;
import java.lang.*;

class FileException 
{
	public static void main(String args[]) throws IOException, NullPointerException, FileNotFoundException
	{	
		FileInputStream r = null;
		FileOutputStream w = null;
		
		try
		{
			r = new FileInputStream("C:\\Users\\acer\\OneDrive\\Desktop\\Java\\file.txt");
			w = new FileOutputStream("C:\\Users\\acer\\OneDrive\\Desktop\\Java\\fileout.txt");
		
			int i;
			
			System.out.println("\nThe contents of file.txt are,\n");
			while((i = r.read()) != -1)
			{
				System.out.print((char)i);
				w.write(i);
			}
			
			System.out.println("\n\nThe contents of file.txt has been successfully copied to fileout.txt");
			r.close();
			w.close();
		}

		catch (Exception e)
		{
			System.out.println("\nThe following exception occured during execution,");
			System.out.println(e);
		}
			
		finally
		{
			System.out.println("\nFile Exception Handling Program");
		}
	}
}	