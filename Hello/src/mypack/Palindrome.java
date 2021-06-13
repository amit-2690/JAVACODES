package mypack;
import java.lang.*;

public class Palindrome {

	public static void main(String[] args) 
	{
		String v = "DAD";
		String rev = "";
		//char a[]=v.toCharArray();
		for (int i =v.length()-1;i>= 0;i--)
		{
			rev = rev+v.charAt(i);
		}
		System.out.println(rev);
		if (v.equals(rev)) {
			System.out.println(v+" is a Palindrome");
		}
		else
		{
			System.out.println(v+" is not a Palindrome");
		}
		
	}

}
