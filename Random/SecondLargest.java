package Random;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class SecondLargest 
{
	public static void main(String[] args) 
	{
		int[] arr = {55, 23, 17, 9, 42, 8, 31, 14,55,55,55, 20};
		int fmax=0,smax=0;
		for(int i:arr)
		{
			if(i>fmax)
			{
				smax=fmax;
				fmax=i;
			}
			else if(i>smax && i!=fmax)
			{
				smax=i;
			}
		}
		System.out.println(fmax+" dfg "+smax);
		System.out.println(getMaxOccuringChar("orqxvbq"));

	}
	 public static char[] getMaxOccuringChar(String line)
	    {
	        LinkedHashSet<Character> ch = new LinkedHashSet<>();
	        String ans = "";
	        for(int i = 0; i < line.length(); i++)
	        {
	            ch.add(line.charAt(i));
	        }
	        int temp = 0;
	        for(Character cha : ch)
	        {
	            int count = 0;
	            for(int i = 0; i < line.length(); i++)
	            {
	                if(line.charAt(i)==cha)
	                    count++;
	            }
	            if(count>=temp)
	            {
	                temp = count;
	                ans+=cha;
	            }
	        }
	        char[] arr = ans.toCharArray();
	        Arrays.sort(arr);
	        return arr;
	    }
}
