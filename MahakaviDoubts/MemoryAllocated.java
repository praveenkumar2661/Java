package MahakaviDoubts;

import java.util.Scanner;

public class MemoryAllocated {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ans = 0;
		for (int i = 0; i < num; i++) 
		{
			int m = sc.nextInt();
			if(i == 0 || (i%2==0))
				ans+=m;
		}
		System.out.println(ans);
	}

}
