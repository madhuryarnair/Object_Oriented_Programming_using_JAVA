class Vowels
{
	public static void main(String args[])
	{
		String str = "Welcome To Java Programming";
		
		int len = str.length();
		int vc=0, cc=0;
		
		for (int i=0 ; i<len ; i++)
		{
			if (str.charAt(i)=='a' || str.charAt(i)=='A' || str.charAt(i)=='e' || str.charAt(i)=='E' || str.charAt(i)=='i' || str.charAt(i)=='I' || str.charAt(i)=='o' || str.charAt(i)=='O' || str.charAt(i)=='u' || str.charAt(i)=='U')
				vc++;
			
			else if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'))
				cc++;
		}
		
		System.out.println(vc);
		System.out.println(cc);
	}
}

