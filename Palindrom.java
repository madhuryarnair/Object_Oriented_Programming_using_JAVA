import java.util.*;

class Palindrom
{
	public static void main(String args[])
	{
		String original, reverse = "";
		int i, len;
		original = args[0];
		len = original.length();
		for(i=len-1;i>=0;i--)
		reverse = reverse + original.charAt(i);
		if(original.equals(reverse))
		System.out.println("palindrome");
	}
}	