package MahakaviDoubts;

import java.util.Scanner;

public class GuessNumber 
{
	public static void main(String[] args) 
	{
		search(0,end(10));
	}
	
	private static int end(int n)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Is your number between 0 to "+n+" (y or n)");
		String c = sc.next();
		if(c.equals("y"))
			return n;
		else
		{
			n*=2;
			end(n);
		}
		return n;	
	}
	
	private static void search(int a, int b)
	{
		Scanner sc = new Scanner(System.in);
		int start = a;
		int end = b;
		while(start <= end)
		{
			int mid = (start+end)/2;
			System.out.println("Is your number (y or n) "+mid);
			String s = sc.next();
			if(s.equals("y"))
			{
				System.out.println("Hooray!!! Your number is "+mid);
				return;
			}
			else
			{
				System.out.println("Is your number greater than (y or n) "+mid);
				String t = sc.next();
				if(t.equals("y"))
					start = mid+1;
				else
					end = mid - 1;
			}
			
		}
	}

}
