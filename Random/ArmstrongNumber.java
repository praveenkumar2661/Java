package Random;

public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		for (int i = 100; i < 10000; i++) 
		{
			int num = i;
			int temp = num;
			int ans = 0;
			
			while(num>0)
			{
				int rem = num%10;
				ans+=(pow(rem,dc(i)));
				num/=10;
			}
			if(ans == temp)
				System.out.println(ans+" Armstrong");
		}
	}

	private static int pow(int rem, int dc) 
	{
		int ans = 1;
		for (int j = 0; j < dc; j++) 
		{
			ans*=rem;
		}
		return ans;
	}

	private static int dc(int i) 
	{
		int count = 0;
		while(i>0)
		{
			count++;
			i/=10;
		}
		return count;
	}
}
