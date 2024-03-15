package OOPs;
abstract class demo
{
	int num = 10;
	abstract void add(int num);
	void subtract(int num)
	{
		System.out.println("Sub");
	}
}

class demo2 extends demo
{
	@Override
	void add(int num) 
	{
		System.out.println("Add");
	}
	
}
public class AbstractClass_OOPs 
{
	public static void main(String[] args)
	{
		demo2 d2 = new demo2();
		d2.add(0);
	}
}
