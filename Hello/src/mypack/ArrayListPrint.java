package mypack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayListPrint {

	public static void main(String[] args) 
	{
		ArrayList <Integer> list = new ArrayList <Integer>();
		list.add(99);
		list.add(65);
		list.add(77);
		list.add(66);
		
		System.out.println("Original order is :");
		for (Object obj:list)
		{
			System.out.print(obj+" ");
		}
		System.out.println(" ");
		System.out.println("Reverse order is :");
		for (int i = list.size()-1;i>=0; i --)
		{
			System.out.print(list.get(i)+" ");
		}
		
		Collections.sort(list);
		System.out.println(" ");
		System.out.println("Sorted order is :");
		for (int i = 0;i<=list.size()-1; i++)
		{
			System.out.print(list.get(i)+" ");
		}
		
		

	}

}
