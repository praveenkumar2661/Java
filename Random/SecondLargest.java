package Random;

public class SecondLargest 
{
	public static void main(String[] args) 
	{
		int[] arr = {55, 23, 17, 9, 42, 8, 31, 14,55,55,55, 20};
		int fmax=0,smax=0;
		for(int i:arr)
		{
			if(i>fmax)
			{
				smax=fmax;
				fmax=i;
			}
			else if(i>smax && i!=fmax)
			{
				smax=i;
			}
		}
		System.out.println(fmax+" dfg "+smax);

	}
}
