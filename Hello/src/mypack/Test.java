package mypack;

public class Test {

	public static void main(String[] args) {
		 int input [] = {1,2,3,4,5,6};
		 
		 int arr1[] = new int[(input.length)/2];
		 int arr2[] = new int[input.length -arr1.length]; 
					 
		 int count =0;
		 for (int i = 0;i< input.length;i++)
		 {
			 if (i<(input.length)/2)
			 {
				 arr1[count]=input[i];
			 }
			 
			 else
			 {
			  arr2 [count-arr1.length]=input[i];
			 }
			
			  count++;
		 }
		 
		 for (int i =0;i<arr1.length;i++)
		 {
			 System.out.print(arr1[i]+" ,");
		 }
		 for (int i =0;i<arr2.length;i++)
		 {
			 System.out.print(arr2[i]+" ,");
		 }
		 
		

	}

}
