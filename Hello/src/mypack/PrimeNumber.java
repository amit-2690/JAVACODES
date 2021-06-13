package mypack;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int i,j;
		
		for ( j=1;j<100;j++)
		{
			int count = 0;
			for (i = 1;i<= j/2; i++ )
			{
				if (j % i == 0)
					{
						count++;
						if (count > 1)
							break;
					}
							
			}
			
			if (count > 1)
				System.out.println(j + " is not a prime no");
			else
				System.out.println(j + " is a prime no");
			
			
			
		
		}
		
		
		
	}

}
