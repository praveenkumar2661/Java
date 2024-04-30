package Random;

import java.util.Arrays;

public class mdadd 
{
	public static void main(String[] args) {
//		int[][] arr1 = {{1,1,1},{2,2,2},{3,3,3}};
//		int[][] arr2 = {{1,1,1},{2,2,2},{3,3,3}};
//		
//		for (int i = 0; i < arr1.length; i++) {
//			for (int j = 0; j < arr1[i].length; j++) {
//				System.out.print(arr1[i][j]+arr2[i][j]+" ");
//			}
//			System.out.println();
//		}
//		int[] array = {9,9,9};
//		int fmax = array[0];
//		int smax = array[0];
//		for(int i = 0; i < array.length; i++)
//		{
//			if(array[i]>fmax)
//			{
//				smax = fmax;
//				fmax = array[i];
//			}
//			else if(array[i]>smax && smax != fmax )
//				smax = array[i];
//		}
//		System.out.println(smax);
		
		
		String s = "<html><head><title>Page Title</title></head><body><h1>This is a Heading</h1><p>This is a paragraph.</p></body></html>";
		String[] arr = s.split("<");
		System.out.println(Arrays.toString(arr));
	}
}
