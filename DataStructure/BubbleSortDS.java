package DataStructure;

import java.util.Arrays;

public class BubbleSortDS
{
	public static void main(String[] args) 
	{
		 int[] unsortedArray = {5, 2, 8, 1, 9, 4, 6};
		 bubbleSort(unsortedArray);
		 System.out.println(Arrays.toString(unsortedArray));

	}

	private static void bubbleSort(int[] unsortedArray)
	{
		boolean swapped;
		for (int i = 0; i < unsortedArray.length; i++) 
		{
			swapped = false;
			for (int j = 0; j < unsortedArray.length - i -1; j++)
			{
				if(unsortedArray[j]>unsortedArray[j+1])
				{
					int temp = unsortedArray[j];
					unsortedArray[j] = unsortedArray[j+1];
					unsortedArray[j+1] = temp;
					swapped = true;
				}
			}
			if(!swapped)
				break;
		}
		
	}
	
	
}
