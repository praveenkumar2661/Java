package DataStructure;

import java.util.Arrays;

public class CyclicSortDS 
{
	public static void main(String[] args)
	{
		int[] arr = {3,2,1};
		cyclicSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	private static void cyclicSort(int[] arr)
	{
		int i = 0;
		while(i < arr.length)
		{
			int correct = arr[i]-1;
			if(arr[i] != arr[correct])
				swap(arr, i, correct);
			else
				i++;
		}
	}

	private static void swap(int[] arr, int a, int b) 
	{
		int c = arr[a];
		arr[a] = arr[b];
		arr[b] = c;
	}
}
