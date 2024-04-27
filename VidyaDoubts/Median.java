package VidyaDoubts;

public class Median 
{
	private static double median(int[] nums)
	{
		
		if(nums.length%2==0)
		{
			double ans = nums[(nums.length/2)-1] + nums[nums.length/2];
			return ans/2;
		}
		else
			return nums[(nums.length/2)];
	}
	public static void main(String[] args)
	{
		int[] nums = {1,2,3,4};
		System.out.println(median(nums));
	}
}
