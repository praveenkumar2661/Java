package OOPs;

public interface Interface_OOPs 
{
	int num = 10;
	static void add()
	{
		System.out.println("Add");
	}
	void sub();
}
class interfacedemo implements Interface_OOPs
{
	public void sub()
	{
		System.out.println("Sub");
		Interface_OOPs.add();
	}
}
