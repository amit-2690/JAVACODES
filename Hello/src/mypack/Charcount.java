package mypack;

import java.util.HashMap;

public class Charcount {

	public static void main(String[] args) 
	{
		String input = "Geek for Geeks";
		//char [] inputarr = input.toCharArray();
		HashMap <Character, Integer> mapinput = new HashMap <Character, Integer>();
		for (int i=0;i<=input.length() -1;i++)
		{
			char c = input.charAt(i);
			if (mapinput.containsKey(c))
			{
//			Integer value = mapinput.get(c);
//			value++;
				mapinput.put(c, mapinput.get(c) + 1);
			}
			else
			{
				mapinput.put(c,1);
			}
		}
		System.out.println(mapinput);

	}

}
