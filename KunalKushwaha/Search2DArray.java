package KunalKushwaha;

import java.util.Arrays;

public class Search2DArray 
{
	public static void main(String[] args) 
	{
		int[][] arr = {
				{23, 4, 1},
				{18, 12, 3, 9},
				{78, 99, 34, 56},
				{18, 12}
	        };
		int target = 56;
		System.out.println(Arrays.toString(index(arr,target)));
	}

	private static int[] index(int[][] arr, int target)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				if(arr[i][j] == target)
					return new int[] {i,j};
			}
		}
		return null;
	}
}
