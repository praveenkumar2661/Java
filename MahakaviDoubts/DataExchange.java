package MahakaviDoubts;

public class DataExchange 
{
	public static void main(String[] args) 
	{
		int num = 25;
		String s = "";
		while(num>0)
		{
			int rem = num%2;
			s+=rem;
			num/=2;
		}
		for (int i = s.length()-1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		
	}
}
