package VidyaDoubts;

import java.util.Scanner;

public class ReverseSpecialString
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] arr = new char[s.length()];
		String b = "", ans = "";
		int y = 0;
		for (int i = s.length()-1; i >= 0; i--) 
		{
			if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z'))
				b+=s.charAt(i);
			else
				arr[i] = s.charAt(i);
		}
		for (int i = 0; i < arr.length; i++) 
		{
			if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z'))
				arr[i] = b.charAt(y++);
			ans+=arr[i];
		}
		System.out.println(ans);
	}
}
