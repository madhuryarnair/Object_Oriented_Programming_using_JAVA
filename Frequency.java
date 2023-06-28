//Frequency of Characters

class Frequency
{
	public static void main(String args[])
	{	
		System.out.print("\n");
		
		String s = "MISSISSIPPI";
		int i, mc = 0, ic = 0, sc = 0, pc = 0, len;
		
		System.out.println("The given string is: " + s + "\n");
		
		len = s.length();
		
		for (i=0 ; i<len ; i++)
		{
			if (s.charAt(i) == 'M')
				mc++;
			
			else if (s.charAt(i) == 'I')
				ic++;
			
			else if (s.charAt(i) == 'S')
				sc++;
			
			else
				pc++;
		}

		System.out.println("The frequency of 'M' is " + mc);
		System.out.println("The frequency of 'I' is " + ic);
		System.out.println("The frequency of 'S' is " + sc);
		System.out.println("The frequency of 'P' is " + pc);
	}
}	
			
				
		
		