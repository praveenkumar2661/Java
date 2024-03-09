package KunalKushwaha;

public class EvenDigits 
{
	public static void main(String[] args) 
	{
		int[] arr = {12, 345, 2, 6, 7896};
		System.out.println(findNumbers(arr));
	}

	private static int findNumbers(int[] arr) 
	{
		int count = 0;
		for (int element : arr)
		{
			if(even(element))
				count++;
		}
		return count;
	}

	private static boolean even(int element) 
	{
		int count = 0;
		while(element>0)
		{
			count++;
			element/=10;
		}
		if(count%2 == 0)
			return true;
		else
			return false;
	}
	
}
