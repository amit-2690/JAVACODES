package mypack;

public class StringMatch {

	public static void main(String[] args) {
		String source = "sjdlkjABCDdsjk";
		String input = "ABC";
			
		for (int i=0;i<source.length()- input.length();i++)
		{
			int j;
			for (j = 0; j < input.length(); j++)
	            if (source.charAt(i+j) != input.charAt(j))
	                break;
			
				if (j== input.length())
				{
					System.out.println("Is present at "+ i+" position");	
				}
		}
		
		
	}

}
