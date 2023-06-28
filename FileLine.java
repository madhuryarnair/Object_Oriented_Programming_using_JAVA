//File Exception Handling

import java.io.*;
import java.lang.*;
import java.util.*;

class FileLine
{
	public static void main(String args[]) throws IOException, NullPointerException, FileNotFoundException
	{	
		File r = null;
		FileInputStream fr = null;
		BufferedReader br = null;
		
		try
		{
			r = new File("C:\\Users\\acer\\OneDrive\\Desktop\\Java\\file.txt");
			fr = new FileInputStream(r);
			br = new BufferedReader(new InputStreamReader(fr));
			
			int c=0;
			
			while (br.readLine()!=null)
			{
				c++;
			}
			System.out.println(c);
			br.close();
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