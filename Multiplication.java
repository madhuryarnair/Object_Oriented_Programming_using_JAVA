//Matrix Multiplication

class Multiplication
{
	public static void main(String args[])
	{
		int a[][] = {{1,2} ,
		
					 {3,4}},
				
			b[][] = {{5,6} ,
					
					 {7,8}},
					 
			m[][] = {{0,0} , 
				
					 {0,0}};
		
		int i, j, k; 
		
		System.out.println("\nThe First Matrix is,");
			for (i=0 ; i<2 ; i++)
			{
				for (j=0 ; j<2 ; j++)
				{
					System.out.print(a[i][j]);
					System.out.print("\t");
				}
				
				System.out.print("\n");
			}
			
		System.out.println("\nThe Second Matrix is,");
			for (i=0 ; i<2 ; i++)
			{
				for (j=0 ; j<2 ; j++)
				{
					System.out.print(b[i][j]);
					System.out.print("\t");
				}
				
				System.out.print("\n");
			}
		
		for (i=0 ; i<2 ; i++)
		{
			for (j=0 ; j<2; j++)
			{
				for (k=0 ; k<2 ; k++)
				{
					m[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		System.out.println("\nThe Matrix after Multiplication is,");
			for (i=0 ; i<2 ; i++)
			{
				for (j=0 ; j<2 ; j++)
				{
					System.out.print(m[i][j]);
					System.out.print("\t");
				}
				
				System.out.print("\n");
			}
	}
}	
			
			