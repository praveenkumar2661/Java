package Random;

public class demo 
{
	public static void main(String[] args) {
		int num = 6;
		for (int i = 0; i < num; i++) 
		{
			for (int j= 0 ; j < num; j++) 
			{ 
				if(i==0)
					System.out.print(j+" ");
				else if(j==0)System.out.print(i+" ");
				else 
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
	}
}
