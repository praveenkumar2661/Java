package OOPs;
class Engine
{
	int cc;
	int version;
	Engine(int eCC, int version)
	{
		this.cc = eCC;
		this.version = version;
	}
	public String toString()
	{
		return "Engine [cc="+cc+" version"+version+" ]";
	}
}
class Car
{
	String name;
	String color;
	Engine engine;
	Car(String name, String color, Engine engine)
	{
		this.name = name;
		this.color = color;
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", engine=" + engine + "]";
	}
	
}
public class Composistion_OOPs
{
	public static void main(String[] args)
	{
		Car Skoda = new Car("Skoda", "Black", new Engine(1499, 9));
		System.out.println(Skoda);
	}
}
