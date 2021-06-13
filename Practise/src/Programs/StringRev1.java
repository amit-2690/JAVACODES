package Programs;

public class StringRev1 {

	public static void main(String[] args)
	{
		String input = "Amit Kumar";
		//output ="timA ramuK"
		String insplit[] = input.split(" ");
		
		for (String w :insplit)
		{
			StringBuffer rev = new StringBuffer (w);
			StringBuffer output = rev.reverse();
			System.out.print(output+" ");
		}
		
		
	}

}
