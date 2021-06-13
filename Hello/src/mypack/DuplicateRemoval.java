package mypack;

import java.util.HashMap;
import java.util.HashSet;

public class DuplicateRemoval {

	public static void main(String[] args) {
		String input = "amitkumarbarauni";
		HashSet <Character> set = new HashSet <Character> ();
		for (int i = 0; i< input.length();i++)
		{
			set.add(input.charAt(i));
		}
		
//		for (Character d: set)
//		{
//			System.out.print(d+ " ");
//		}
		
		System.out.println(set);
		

	}

}
