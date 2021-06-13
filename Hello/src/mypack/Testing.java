package mypack;

import java.util.HashMap;
import java.util.Map.Entry;

 public class Testing {

	public static void main(String[] args) 
	{
		String input = "aba";
		int count = 0;
		String reverse = "";
		for (int i=0;i<input.length();i++)
		{
			for (int j=i;j<input.length();j++)
			{
				String substr = input.substring(i,j+1);
				System.out.println(substr);
				for ( int k = substr.length()-1; k >= 0; k-- ) 
				   reverse = reverse + substr.charAt(k);
				
//			      if (substr.equals(reverse))  
//			      {
//			       System.out.println(reverse);
//			      }
//				
				
						
			}
		}
		//System.out.println(count);

	}
}
//s}
