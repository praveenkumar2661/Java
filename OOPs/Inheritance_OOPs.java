package OOPs;



class A
{
	int x = 10;
}
class B extends A
{
	int x = 12;
	int y = 100;
}
public class Inheritance_OOPs 
{
	public static void main(String[] args)
	{
		B b = new B();
		
		System.out.println(b.x);
		System.out.println(b.y);
		
	}
}
