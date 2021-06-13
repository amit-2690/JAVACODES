package Programs;

public class StringRev {

	public static void main(String[] args) 
	{
		String input = "Amit Kumar Akb";
		char [] inarr = input.toCharArray();
		char [] output = new char [inarr.length];
		
		for(int i=0;i< inarr.length;i++)
		{
			if (inarr[i] == ' ')
			{
				output [i] = ' ';
			}
				
		}
		
		int j= inarr.length-1;
		
		for(int i=0;i< inarr.length;i++)
		{
			if (inarr [i]!= ' ')
			{
				if(output [j] == ' ')
				{
					j--;
				}
				output [j] = inarr[i];
				j--;
			}
			
			
		}
		
		System.out.println(output);

	}

}
