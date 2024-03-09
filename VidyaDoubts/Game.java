package VidyaDoubts;
import java.util.HashSet;
import java.util.Scanner;
public class Game 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println(check(a,b));
	}

	private static int check(String a, String b) 
	{
		int res = 0;
		HashSet<Character> a_str = new HashSet<Character>();
		for (int i = 0; i < a.length(); i++)
			a_str.add(a.charAt(i));
		HashSet<Character> b_str = new HashSet<Character>();
		for (int i = 0; i < b.length(); i++)
			b_str.add(b.charAt(i));
		for (Character character : b_str)
		{
			if(a_str.contains(character))
				res++;
		}
		if(res < 2)
			return 2;
		else if(res >= 2 && res <= 10)
			return 10;
		else
			return 15;
	}
}
