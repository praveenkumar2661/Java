package OOPs;
class Method1
{
	void payment()
	{
		System.out.println("Hello");
	}
}
class Method2 extends Method1
{
	void payment()
	{
		System.out.println("Hello Praveen!!!");
	}
}
public class Polymorphism_OOPs 
{
	public static void main(String[] args) {
		Method2 m2 = new Method2();
		m2.payment();
	}
}
