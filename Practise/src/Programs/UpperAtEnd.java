package Programs;

public class UpperAtEnd {

	public static void main(String[] args) 
	{
		String input = "RoYaLENfieLd";
		char c;
		String upper ="";
		String lower ="";
		String output= "";
		
		for (int i=0;i<input.length();i++)
		{
			c= input.charAt(i);
			if (c>= 'A'& c<='Z')
			{
				upper= upper+c;
			}
			//
			
			else if(c>='a' & c<='z')
			{
				lower = lower+c;
			}
			
		}
		System.out.println(upper);
		System.out.println(lower);
		
		output= lower+upper;
		System.out.println(output);
	}

}
