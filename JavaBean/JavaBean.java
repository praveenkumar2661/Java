package JavaBean;
class Employee
{
	private int id;
	private String name;
	Employee()
	{
		
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public void setID(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String toString()
	{
		return "ID: "+id+" Name: "+name;
	}
}
public class JavaBean
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		e1.setID(1);
		e1.setName("Praveen");
		System.out.println(e1.getId());
		System.out.println(e1);
	}
}
