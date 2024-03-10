package DataStructure;

import java.util.Arrays;

public class SelectionSortDS
{
	public static void main(String[] args)
	{
		 int[] unsortedArray = {5, 2, 8, 1, 9, 4, 6};
		 selectionSort(unsortedArray);
		 System.out.println(Arrays.toString(unsortedArray));
	}

	private static void selectionSort(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			int end = arr.length-1-i;
			int maxIndex = max(arr,0,end);
			swap(arr,maxIndex, end);
		}
	}
	private static int max(int[] arr, int start, int end)
	{
		int max = start;
		for (int i = start; i <= end; i++) 
		{
			if(arr[i]>arr[max])
				max = i;
		}
		return max;
	}
	private static void swap(int[] arr, int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
