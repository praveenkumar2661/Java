package VidyaDoubts;

import java.util.Scanner;

public class BetsyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int ans = 0;
		for (int i = start; i < end; i++) 
		{
			if(betsyCheckF(i) || betsyCheckR(i))
			{
				ans+=i;
				System.out.println(i);
			}
		}
		System.out.println(ans);
	}
	static boolean betsyCheckF(int num)
	{
		if(num<=10)
			return true;
		else
		{
			String n = Integer.toString(num);
			int count = 0;
			int pivot = n.length()-1;
			int i = 0;
			while(pivot!=0)
			{
				if((n.charAt(i+1)-n.charAt(i) == 1))
					count++;
				i++;
				pivot--;
			}
			if(count == n.length()-1)
				return true;
		}
		return false;
	}
	static boolean betsyCheckR(int num)
	{
		if(num<=10)
			return true;
		else
		{
			String n = Integer.toString(num);
			int count = 0;
			int pivot = n.length()-1;
			int i = 0;
			while(pivot!=0)
			{
				if((n.charAt(i+1)-n.charAt(i) == -1))
					count++;
				i++;
				pivot--;
			}
			if(count == n.length()-1)
				return true;
		}
		return false;
	}
}
