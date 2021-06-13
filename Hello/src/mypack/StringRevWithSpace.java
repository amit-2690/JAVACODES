package mypack;

public class StringRevWithSpace {

	public static void main(String[] args) 
	{
		String input = "My name is Amit Kumar";
		char [] inputArray = input.toCharArray();
		char [] output = new char [inputArray.length];
		
		for (int i =0;i< inputArray.length;i++)
		{
			if (inputArray[i] == ' ')
			{
				output[i]= ' ';
			}
		}
		
		int j= inputArray.length-1;
		
		for (int i = 0;i<inputArray.length;i++)
		{
			if(inputArray[i] != ' ')
			{
				if (output[j] == ' ')
				{
					j--;
				}
						
				output[j] =inputArray [i];
				j--;
				
			}
		}
	System.out.println(output);
	}

}
