package mypack;

public class Comparision {

	public static void main(String[] args) {
		String input1 = "Amit";
		String input2 = new String ("Amit");
		String input3 = input1;
		String input4 = new String ("Amit");
		String input5 = new String ("amit");
		String input6 = "Amit";
		if (input4 == input5)
		{
			System.out.println("== compares object");
		}
		 else if (input1.equals(input2))
		{
			System.out.println(".equals compares values/content");
		}
		else if (input1.equals(input3))
		{
			System.out.println("1 and 3 are equal");
		}
		if (input1.equals(input4))
		{
			System.out.println("1 and 4 are equal");
		}
		
		if (input4.equals(input5))
		{
			System.out.println("4 and 5 are equal");
		}
		else if (input4.equalsIgnoreCase(input5))
		{
			System.out.println("4 and 5 are equal without case");
		}
		
	}

}
