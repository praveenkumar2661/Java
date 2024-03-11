package Random;

public class SecretAgent 
{
	public static void main(String[] args) 
	{
		int[] randomArray = {21,3,4,42,67,1,9};
		leftRotatedArray(randomArray,4);
		for (int i = 0; i < randomArray.length; i++)
		{
			if(randomArray[i]<10)
				System.out.print(10-randomArray[i]+" ");
			else
				System.out.print(randomArray[i]%10+" ");
		}
	}

	private static void rightRotatedArray(int[] arr,int num) 
	{
		for (int j = 0; j < arr.length; j++) 
		{
			int temp = arr[0];
			for (int i = 0; i < arr.length-1; i++) 
			{
				int c = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = c;
			}
			arr[arr.length-1] = temp;
		}
	}
	
	private static void leftRotatedArray(int[] arr, int num) 
	{
		for (int j = 0; j < num; j++) 
		{
			int temp = arr[arr.length-1]; 
			for (int i = arr.length-2; i >= 0; i--) 
			{
				int c = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = c;
			}
			arr[0]= temp;
		}
	}
	
}
