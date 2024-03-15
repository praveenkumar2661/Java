package OOPs;
class Students
{
	int id;
	String name;
	int tamilMark;
	int englishmark;
	int mathsMark;
	Students()
	{
		
	}
	Students(int id, String name, int tamilMark, int englishMark, int mathsMark)
	{
		this.id = id;
		this.name = name;
		this.tamilMark = tamilMark;
		this.englishmark = englishMark;
		this.mathsMark = mathsMark;
	}
	void avg()
	{
		System.out.println("Average: "+(tamilMark+englishmark+mathsMark)/3);
	}
	int avgRes()
	{
		return (tamilMark+englishmark+mathsMark)/3;
	}
	void check()
	{
		String res;
		if(avgRes()>50)
			res = "Pass";
		else
			res = "Fail";
		System.out.println("Result of Student: "+res);
	}
}
public class Constructor_OOPs
{
	public static void main(String[] args) 
	{
		Students Mahakavi = new Students(1,"Mahakavi",70,80,90);
		Mahakavi.avg();
		Mahakavi.check();
	}
}
