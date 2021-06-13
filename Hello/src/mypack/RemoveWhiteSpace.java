package mypack;

public class RemoveWhiteSpace {

	public static void main(String[] args) 
	{
		String input = "Geek for Geeks";
		String [] split = input.split(" ");
		
		for (String charr: split)
		{
			System.out.print(charr);
		}
		
	}

}
