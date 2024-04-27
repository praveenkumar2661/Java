package DataStructure;

import java.util.Arrays;

public class CyclicSortDS 
{
	public static void main(String[] args)
	{
		int[] arr = {8,3,2,1,4,7,6,5};
		cyclicSort(arr);
		for (int i : arr) 
			System.out.print(i+" ");
		
	}
	
	private static void cyclicSort(int[] arr)
	{
		for(int i = 0; i < arr.length;i++)
		{
			int correct = arr[i] -1;
			if(arr[i] != correct)
				swap(arr, i, correct);
			
		}
	}

	private static void swap(int[] arr, int a, int b) 
	{
		int c = arr[a];
		arr[a] = arr[b];
		arr[b] = c;
	}
}
