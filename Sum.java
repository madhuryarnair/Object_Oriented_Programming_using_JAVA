//String Tokenizer class

import java.util.StringTokenizer;
import java.util.Scanner;

class Sum
{
	public static void main(String args[])
	{
		int sum = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("\nEnter the line of integers: ");
		String str = s.nextLine();
		
		StringTokenizer st = new StringTokenizer(str, "#");
		
		System.out.println("The entered integers are,");
		while (st.hasMoreTokens())
		{
			int num = Integer.parseInt(st.nextToken());
			
			System.out.println(num);
			
			sum += num;
		}
		
		System.out.println("\nThe sum of the entered intergers is " + sum);
	}
}
		