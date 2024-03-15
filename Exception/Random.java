package Exception;
class WrongNumberException extends Exception
{
//	public WrongNumberException()
//	{
//		System.out.println("Wrong Number using Constructor Calling!!!");
//	}
	void wrongNumber()
	{
		System.out.println("Wrong Number using Method Calling");
	}
}
public class Random
{
	public static void main(String[] args) throws WrongNumberException
	{
		int num = 10;
		if(num>10)
			System.out.println("Good");
		else
			new WrongNumberException().wrongNumber();
				
	}
}
