package MahakaviDoubts;

import java.util.Scanner;

public class Temperature 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		for (int i = 0; i < num; i++) 
		{
			int nu = sc.nextInt();
			if(nu<0)
				count++;
		}
		System.out.println(count);
	}
}
