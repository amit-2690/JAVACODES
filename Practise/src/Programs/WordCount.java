package Programs;

public class WordCount {

	public static void main(String[] args) {
		String input = "isUpperCountAvailable";
		int UPCNT = 0;
		for (int i=0;i<input.length();i++)
		{
			if (i==0)
			{
				UPCNT= UPCNT+1;
			}
			else if (input.charAt(i)>='A'& input.charAt(i)<='Z')
			{
				UPCNT= UPCNT+1;
			}
		}
		
		System.out.println(UPCNT);
	}

}
