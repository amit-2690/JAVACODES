package mypack;

public class BinarySearch {

	public static void main(String[] args)
	{
		Integer [] list = {1,3,76,99,105,110,120,140,144};
		int len = list.length;
		int low = 0;
		int high = len-1;
		System.out.println("Initial low and high respectively are "+low +" "+ high);
		int num = 99;
		//int mid = (low+high)/2;
		while (low<= high)
		{
			int mid = (low+high)/2;
			if (list [mid]== num)
			{
				System.out.println(num +" is found at " +(mid+1)+" position");
				break;
			}
			else if (list[mid]> num)
			{
				high = mid-1;
			}
			else if (list [mid]< num)
			{
				low = mid+1;
			}
			//mid = (low+high)/2;
			System.out.println("low and high respectively are "+low +" "+ high);
		}
		
		if (low> high)
		{
			System.out.println(num +" is not found in the list ");
		}
		
	}

}
