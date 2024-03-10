package DataStructure;

import java.util.Arrays;

public class InsertionSortDS
{
	public static void main(String[] args) 
	{
		int[] unsortedArray = {5, 2, 8, 1, 9, 4, 6};
		insertionSort(unsortedArray);
		System.out.println(Arrays.toString(unsortedArray));
	}

	private static void insertionSort(int[] arr)
	{
		for (int i = 0; i < arr.length-1; i++) 
		{
			for (int j = i+1; j > 0; j--) 
			{
				if(arr[j]<arr[j-1])
				{
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
				else
					break;
			}
		}
	}
}
