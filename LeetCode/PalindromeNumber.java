package LeetCode;

public class PalindromeNumber 
{
	public static void main(String[] args) {
		System.out.println(isPalindrome(-121));
	}
	public static boolean isPalindrome(int x) 
    {
       String s = Integer.toString(x);
       String ans = "";
       for (int i = s.length()-1; i >= 0; i--)
    	   ans+=s.charAt(i);
       if(ans.equals(s))
    	   return true;
       return false;
    }
}
