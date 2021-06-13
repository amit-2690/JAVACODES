package mypack;

public class StringRev {

	public static void main(String[] args) {
		String name = "Ritu Kumari";
		String namesplit []= name.split(" ");
		for (String split: namesplit)
		{
			StringBuffer rev = new StringBuffer (split);
			StringBuffer revString = rev.reverse();
			System.out.print(revString+ " ");
		}
	}

}
