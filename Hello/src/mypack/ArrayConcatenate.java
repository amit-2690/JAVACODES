package mypack;

import java.util.Arrays;

public class ArrayConcatenate {

	public static void main(String[] args) {
		int arr_1[] = {1,2,3};
		int arr_2[] = {1,3,4};
		int arr_3[] = {2,3,4};
		
		//ArrayList list = new ArrayList ();
		
		int output [] = new int [arr_1.length+arr_2.length+arr_3.length
		                       ];
		int i=0;
		for (int element: arr_1)
		{
			output [i]= element;
			i++;
			System.out.println(i);
		}
		
		for (int element: arr_2)
		{
			output [i]= element;
			i++;
			System.out.println(i);
		}
		
		for (int element: arr_3)
		{
			output [i]= element;
			i++;
			System.out.println(i);
		}

		System.out.println(Arrays.toString(output));
	
	System.out.println(" ");
	System.out.println("----Sorted Output Array---");
	
	Arrays.sort(output);
	System.out.println(Arrays.toString(output));
//	for (i =0; i< output.length;i++)
//	{
//		System.out.print(output[i]);
//	}
	
	}
}
