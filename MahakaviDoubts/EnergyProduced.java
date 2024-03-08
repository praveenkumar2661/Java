package MahakaviDoubts;

import java.util.Scanner;

public class EnergyProduced 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.print(a+" ");
		int ans = 1;
		for (int i = 1; i < c; i++) 
		{
			if(i==1)
			{
				ans*=a*b;
				System.out.print(ans+" ");
			}
			else 
			{
				ans*=b;
				System.out.print(ans+" ");
			}
		}
		
	}
}
