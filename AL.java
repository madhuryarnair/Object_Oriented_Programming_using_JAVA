import java.util.*;

class AL
{
	public static void main(String args[])
	{
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(2);
		ar.add(6);
		ar.add(4);
		ar.add(8);
		
		System.out.println(ar);
		
		Collections.sort(ar);
		
		System.out.println(ar);
		
		Collections.reverse(ar);
		
		System.out.println(ar);
	}
}