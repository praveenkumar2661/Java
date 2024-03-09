package DataStructure;

public class LinearSearchDS
{
	public static void main(String[] args) 
	{
		int[] arr = {12,11,34,567,33,87,15,9,1,83};
		int target = 15;
		System.out.println(elementPresent(arr,target));
		System.out.println(searchIndex(arr,target));
		System.out.println(returnElement(arr,target));
	}
	
	private static boolean elementPresent(int[] arr, int target) 
	{
		if(arr.length == 0)
			return false;
		else
		{
			for (int i = 0; i < arr.length; i++) 
			{
				if(arr[i] == target)
					return true;
			}
		}
		return false;
	}

	private static int searchIndex(int[] arr, int target)
	{
		if(arr.length == 0)
			return -1;
		else
		{
			for (int i = 0; i < arr.length; i++) 
			{
				if(arr[i] == target)
					return i;
			}
		}
		return -1;
	}
	
	private static int returnElement(int[] arr, int target)
	{
		if(arr.length == 0)
			return Integer.MIN_VALUE;
		else
		{
			for (int element : arr) 
			{
				if(element == target)
					return element;
			}
		}
		return Integer.MIN_VALUE;
		
	}
}
