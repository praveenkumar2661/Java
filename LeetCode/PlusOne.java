package LeetCode;

import java.util.Arrays;

public class PlusOne
{
	 public static int[] plusOne(int[] digits)
	 {
		 for(int i = digits.length -1; i >= 0; i--)
	       {
	            if(digits[i]!=9)
	            {
	                digits[i] = digits[i] + 1;
	                break;
	            }
	            else
	                digits[i] = 0;
	       }
	        if(digits[0]==0)
	        {
		        int[]r=new int[digits.length+1];
		        r[0]=1;
		        return r;
	        }
	       return digits;
	 }
	 public static void main(String[] args) 
	 {
		 int[] arr= {1,2,3};
		System.out.println(Arrays.toString(plusOne(arr)));
	 }
}
