package KunalKushwaha;

public class CeilingOfAnNumber 
{
	public static void main(String[] args) 
	{
		int[] arr = {2,3,5,9,14,16,18};
		int target = 15;
		System.out.println(searchIndex(arr, target));
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
		return arr[start];
	}
}
