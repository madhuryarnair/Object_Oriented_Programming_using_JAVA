//Palindrome String

class Palindrome
{
	public static void main(String args[])
	{	
		System.out.print("\n");
		
		String s = "MALAYALAM";
		int i, len, flag = 0;
		
		System.out.println("The given string is: " + s);
		
		len = s.length();
		
		for (i=0 ; i<len/2 ; i++)
		{
			if (s.charAt(i) != s.charAt(len-i-1))
			{
				flag = 1;
				break;
			}
		}
		
		if (flag == 0)
			System.out.println("\nThe given string is Palindrome");
		
		else
			System.out.println("\nThe given string is not Palindrome");
	}
}	