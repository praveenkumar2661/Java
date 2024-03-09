package KunalKushwaha;

public class RichestCustomerWealth 
{
	public static void main(String[] args) 
	{
		int[][] account = {
	            {1, 5},       
	            {3, 7},
	            {3, 5}
	        };
		System.out.println(maximumWealth(account));
	}
	public static int maximumWealth(int[][] accounts)
	{
		int max = accounts[0][0];
		for (int i = 0; i < accounts.length; i++) 
		{
			int ans = 0;
			for (int j = 0; j < accounts[i].length; j++)
			{
				ans+=accounts[i][j];
			}
			if(max<ans)
				max = ans;
		}
		return max;
	}
}
