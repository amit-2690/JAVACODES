package Programs;

import java.util.HashMap;
import java.util.Map;

public class Pratise {

	public static void main(String[] args) {
		HashMap <Integer, String> m = new HashMap <Integer, String> ();
		m.put(1, "ABC");
		m.put(2, "PBC");
		m.put(3, "PQRS");
		m.put(4, "BBC");
		
		System.out.println(m);
		
		for (Map.Entry<Integer, String> mapEle: m.entrySet())
				{
					System.out.println(mapEle.getKey());
					System.out.println(mapEle.getValue());
				}
		
		
		

	}

}
