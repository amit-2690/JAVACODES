package mypack;

public class OddEven {

	public static void main(String[] args) 
	{
		int i,Oddcount = 0,Evencount = 0;
		for ( i = 1;i< 100;i++)
		{
			if (i%2 == 0)
			{
				Evencount++;
				System.out.println(i+" is Even no");
			}
			else
			{
				Oddcount++;
				//System.out.println(i+" is Odd no");
			}
		}
		System.out.println("No of Even no is "+ Evencount);
		System.out.println("No of Odd no is "+ Oddcount);

	}

}
