package mypack;

public class RemoveDup {

	public static void main(String[] args) 
	{
		String str = "aimitkumarram";
		
		String op = str.charAt(0)+ "";
				
		for (int i=0; i< str.length();i++)
		{
			for (int j= 0;j <i; j++)
			{
				if (str.charAt(i) == str.charAt(j))
				{
					break;
				}
				if (j == i-1)
				{
					op = op +str.charAt(i);
					System.out.println(str.charAt(i));
					
				}
				
			 }
			
		}
		System.out.println("output is "+" " +op);
	}

}
