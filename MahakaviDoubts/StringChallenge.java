package MahakaviDoubts;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class StringChallenge 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String token = "6x149kwlce";
		String ans = "";
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++)
		{
			set.add(s.charAt(i));
		}
		for (Character character : set) 
		{
			int count = 0;
			for (int i = 0; i < s.length(); i++) 
			{
				if(character == s.charAt(i))
					count++;
			}
			ans += count +""+ character;
		}
		System.out.println(ans);
		for (int i = 0; i < (ans.length()); i++) 
		{
			System.out.print(ans.charAt(i)+"" +token.charAt(i));
		}
		if(ans.length()<token.length())
		{
			int diff = token.length()-ans.length()+2;
			for (int i = diff; i < token.length(); i++) {
				System.out.print(token.charAt(i));
			}
		}
	}
}
