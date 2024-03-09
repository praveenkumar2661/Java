package DataStructure;

public class BinarySearchDS 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,3,5,7,9};
		int target = 9;
		System.out.println(searchIndex(arr,target));
	}

	private static int searchIndex(int[] arr, int target) 
	{
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end)
		{
			int mid = (start+end)/2;
			if(arr[mid] == target)
				return mid;
			else if(arr[mid]>target)
				end = mid-1;
			else
				start = mid+1;	
		}
		return -1;
	}
}
