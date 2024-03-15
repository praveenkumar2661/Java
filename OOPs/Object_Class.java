package OOPs;


class Marker
{
	int ht = 10;
	double price = 20;
	void write()
	{
		System.out.println("Used to write!!");
	}
	void draw()
	{
		System.out.println("Used to draw!!");
	}
}

public class Object_Class 
{
	public static void main(String[] args) 
	{
		Marker m = new Marker();
		System.out.println(m.ht);
		System.out.println(m.price);
		m.draw();
		m.write();
		
		// Re-assign
		m.ht = 12;
		System.out.println(m.ht);
		System.out.println(new Marker().ht);
	}
}
