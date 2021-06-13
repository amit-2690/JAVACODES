package mypack;

import java.util.HashSet;

public class HiJava {

	public static void main(String[] args) {
		HashSet <Integer>hset = new HashSet <Integer> ();
		hset.add(1);
		hset.add(2);
		hset.add(1);
		
		System.out.println(hset.contains("red"));
		
		System.out.println(hset.contains(1));
		
		System.out.println(hset.contains(2));
		
		for (Object w: hset)
		{
			System.out.println(w);
		}
		

	}

}
