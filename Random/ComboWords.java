package Random;
import java.util.LinkedHashSet;
public class ComboWords 
{
	public static void main(String[] args) 
	{
		String str = "abbccc";
		String str1 = "aaaaabcccc";
		System.out.println(check(str));
		System.out.println(check(str1));
	}

	private static boolean check( String str) {
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) 
			set.add(str.charAt(i));
		int max = 0;
		for (Character character : set) 
		{
			int count = 0;
			for (int i = 0; i < str.length(); i++) 
			{				
				if(character == str.charAt(i))
					count++;	
			}
			if(count>max)
				max = count;
			else
				return false;
		}
		return true;
	}
}
